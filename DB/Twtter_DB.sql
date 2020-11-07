create database Twitter
use Twitter


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
CONSTRAINT pk_Follower PRIMARY KEY (followerid,followingid)
)
go

Create Table Blocked
(
userid nvarchar(100) FOREIGN KEY REFERENCES Users(userid),
blockedid nvarchar(100) FOREIGN KEY REFERENCES Users(userid)
CONSTRAINT pk_BlockedUser PRIMARY KEY (userid,blockedid)
)
go

