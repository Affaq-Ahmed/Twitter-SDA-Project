create database Twitter_DB
use Twitter_DB

Create Table Users
(
name nvarchar(100),
userid nvarchar(100) NOT NULL PRIMARY KEY,
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
