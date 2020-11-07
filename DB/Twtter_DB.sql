create database Twitter_DB
use Twitter_DB

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

--Drop Table Users
--Drop Table Followed
--Drop Table Blocked
--Drop Table DM
--Drop Table Tweet
--Drop Table Reply
--Drop Table ReTweet
--Drop Table Likes
--Drop Table Bookmark


-->>----->> Procedures <<------<<--
--1:
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
