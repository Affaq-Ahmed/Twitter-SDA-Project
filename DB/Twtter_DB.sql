--create database Twitter_DB
use Twitter_DB

Drop Table if exists Reply
Drop Table if exists ReTweet
Drop Table if exists Likes
Drop Table if exists Bookmark
Drop Table if exists Followed
Drop Table if exists Blocked
Drop Table if exists DM
Drop Table if exists Tweet
Drop Table if exists Users




-->>----->> Tables <<------<<--
Create Table Users
(
userid nvarchar(100) NOT NULL PRIMARY KEY,
name nvarchar(100),
password nvarchar(30),
)
go

Create Table Followed
(
followerid nvarchar(100) FOREIGN KEY REFERENCES Users(userid),
followingid nvarchar(100) FOREIGN KEY REFERENCES Users(userid),
CONSTRAINT pk_Followed PRIMARY KEY (followerid,followingid)
)
go

Create Table Blocked
(
userid nvarchar(100) FOREIGN KEY REFERENCES Users(userid),
blockedid nvarchar(100) FOREIGN KEY REFERENCES Users(userid)
CONSTRAINT pk_Blocked PRIMARY KEY (userid,blockedid)
)
go

Create Table DM
(
sendid nvarchar(100) FOREIGN KEY REFERENCES Users(userid),
recvid nvarchar(100) FOREIGN KEY REFERENCES Users(userid),
message nvarchar(4000)
CONSTRAINT pk_DM PRIMARY KEY (sendid,recvid)
)
go

Create Table Tweet
(
tweetid int Not Null Primary Key,
userid nvarchar(100) FOREIGN KEY REFERENCES Users(userid),
text nvarchar(1000)
)
go

Create Table Reply
(
tweetid int FOREIGN KEY REFERENCES Tweet(tweetid),
userid nvarchar(100) FOREIGN KEY REFERENCES Users(userid),
rep_tweetid int FOREIGN KEY REFERENCES Tweet(tweetid)
CONSTRAINT pk_Reply PRIMARY KEY (tweetid,userid,rep_tweetid)
)
go

Create Table ReTweet
(
tweetid int FOREIGN KEY REFERENCES Tweet(tweetid),
userid nvarchar(100) FOREIGN KEY REFERENCES Users(userid),
retweetid int FOREIGN KEY REFERENCES Tweet(tweetid)
CONSTRAINT pk_ReTweet PRIMARY KEY (tweetid,userid,retweetid)
)
go

Create Table Likes
(
userid nvarchar(100) FOREIGN KEY REFERENCES Users(userid),
tweet_id int FOREIGN KEY REFERENCES Tweet(tweetid)
CONSTRAINT pk_TweetLikedBy PRIMARY KEY (userid,tweet_id)
)
go

Create Table Bookmark
(
userid nvarchar(100) FOREIGN KEY REFERENCES Users(userid),
tweetid int FOREIGN KEY REFERENCES Tweet(tweetid)
CONSTRAINT pk_Bookmark PRIMARY KEY (userid,tweetid)
)
go


-->>----->> Procedures <<------<<--
--1:
drop procedure if exists Signup
go
create Procedure Signup
@userid nvarchar(100),
@name nvarchar(100),
@password nvarchar(30),
@output int OUTPUT
As
Begin
	if exists (select * From Users where Users.userid=@userid)
		Begin
			set @output=0 --username already exists
			return
		End
	else
		Begin
			Insert into Users values (@userid, @name, @password)
			set @output=1 --Signup successfully
		End
End
go

declare  @Test int
exec Signup 'Qasim_1101', 'Qasim','abcd', @Test OUT
Select @Test
go

declare  @Test int
exec Signup 'Hassan_1102', 'Hassan','abcd', @Test OUT
Select @Test
go

declare  @Test int
exec Signup 'Affaq_1141', 'Affaq','abcd', @Test OUT
Select @Test
go

declare  @Test int
exec Signup 'Khizer_1007', 'Khizer','abcd', @Test OUT
Select @Test
go

declare  @Test int
exec Signup 'faf', 'aff','abcd', @Test OUT
Select @Test
go

select * from Users
go

--2:
drop procedure if exists Signin
go
create Procedure Signin
@userid nvarchar(100),
@password nvarchar(30),
@output int OUTPUT
As
Begin
	if exists (select * From Users where Users.userid=@userid and Users.password=@password)
		Begin
			set @output=1 --login Sucessful
		End
	else
		Begin
			set @output=0 --Invalid
		End
End
go

declare  @Test int
exec Signin 'Qasim_1101','abcd', @Test OUT
Select @Test
go

declare  @Test int
exec Signin 'Qasim_1101','xyz', @Test OUT
Select @Test
go


---------------

drop Procedure if exists Follow
go
create Procedure Follow
@userid nvarchar(100),
@userid2 nvarchar(100),
@output int OUTPUT
As
Begin
	if exists (select * From Blocked where Blocked.userid=@userid2 and Blocked.blockedid=@userid)
		Begin
			set @output=0 --can't follow user2....user2 blocked user1
			return
		End
	else if exists (select * From Blocked where Blocked.userid=@userid and Blocked.blockedid=@userid2)
		Begin
			set @output=-1 --can't follow user2....user1 blocked user2
			return
		End
	else if exists (select * From Followed where Followed.followerid=@userid and Followed.followingid=@userid2)
		Begin
			set @output=-2 --can't follow user2....Already following
			return
		End
	else
		Begin
			Insert into Followed values (@userid, @userid2)
			set @output=1 --Successfully followed
			return
		End
End
go

declare  @Test int
exec Follow 'Qasim_1101','Hassan_1102', @Test OUT
Select @Test
go

declare  @Test int
exec Follow 'Qasim_1101','Khizer_1007', @Test OUT
Select @Test
go

declare  @Test int
exec Follow 'Affaq_1141','Khizer_1007', @Test OUT
Select @Test
go

select * from Followed
go

--4:
drop Procedure if exists UnFollow
go
create Procedure UnFollow
@userid nvarchar(100),
@userid2 nvarchar(100),
@output int OUTPUT
As
Begin
	if exists (select * From Followed where Followed.followerid=@userid and Followed.followingid=@userid2)
		Begin
			Delete from Followed where Followed.followerid=@userid and Followed.followingid=@userid2
			set @output=1 --unfollowed successful
			return
		End
	else
		Begin
			set @output=0 --invalid...Already not following
			return
		End
End
go

declare  @Test int
exec UnFollow 'Qasim_1101','Hassan_1102', @Test OUT
Select @Test
go

select * from Followed
go

--4:
drop Procedure if exists Following
go
create Procedure Following
@userid nvarchar(100)
As
Begin
	select Followed.followingid as Username,Users.name as Name
	from Followed join Users on followingid=userid
	where followerid=@userid
	return
End
go

exec Following 'Qasim_1101'
go

select * from Followed
go

--5:
drop Procedure if exists Followers
go
create Procedure Followers
@userid nvarchar(100)
As
Begin
	select Followed.followerid as Username,Users.name as Name
	from Followed join Users on followerid=userid
	where followingid=@userid
	return
End
go

exec Followers 'Khizer_1007'
go

select * from Followed
go

--5:
drop Procedure if exists Search
go
create Procedure Search
@text nvarchar(100)
As
Begin
	select Users.userid as Username,Users.name as Name
	from Users
	where CHARINDEX(@text, Users.userid)>0 or CHARINDEX(@text, Users.name)>0
	return
End
go

exec Search 'as'
go

select * from Users
go
