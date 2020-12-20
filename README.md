# QUE-Frontend

![alt text](https://static.toiimg.com/thumb/msid-71966504,width-1200,height-900,resizemode-4/.jpg)

## Introduction

---

We aim to provide an easier way for people to access services that require waiting for their turn. With the current situation of the pandemic, it becomes essential to provide a way for people to maintain social distancing in everyday life. With essential everyday necessities including groceries or withdrawing money from the bank, that require people to wait in queues, our product provides a platform for the service giver to create a virtual queue which people can join, without physically rushing into a line. This way, the crowd outside their store/centre can be dismissed as people can wait away and avail the service once our app shows them their turn...

### Working of the API

---

- A Route to register the user. It takes in the following parameters:
  - Name
  - Email
  - Password
  - User is a shopkeeper or the service taker.
- Login using unique mail and password.
  - Returns a jwt token and the user info if successful login else retruns invalid credentials.
  - In case of an <strong>internal server error</strong> it returns 500 with that error.
- A route to get user information.
  - Sends the mongo Object id in the url for the user we want to get the information of.
  - Since this route is protected, send the jwt bearer in the Auth header.
- Route for creating new queue. It includes:
  - Adding a new user to the queue
  - Removing a user from the queue
  - Getting the position of a user in the queue
  - Getting list of people in the queue
  - Data of the person availing the service
  - Getting the count of the queue
  - Deleting the queue as a whole.

## Screenshots

---

|                                |                                |                                |
| :----------------------------: | :----------------------------: | :----------------------------: |
| ![alt text](img/SS/ss1.jpg) | ![alt text](img/SS/ss2.jpg) | ![alt text](img/SS/ss3.jpg) |
| ![alt text](img/SS/ss4.jpg) | ![alt text](img/SS/ss5.jpg) |

## Tools And Technologies Used

---

<img align="left" alt="Visual Studio Code" width="26px" height="26px" src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/visual-studio-code/visual-studio-code.png" />
<img align="left" alt="Node.js" width="26px" src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/nodejs/nodejs.png" />
<img align="left" alt="Mongoose" width="26px" src="https://cms-assets.tutsplus.com/uploads/users/34/posts/29527/preview_image/mongoose.jpg" />
<img align="left" alt="MongoDB" width="26px" src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/mongodb/mongodb.png" />
<img align="left" alt="Express" width="26px" src="https://p7.hiclipart.com/preview/780/57/127/node-js-javascript-database-mongodb-native.jpg" />
<br></br>

# From the Developers

---

### Challenges Faced

- A major challenge that we faced was keeping track of authentic accounts and people leaving the queue.
- Connecting frontend and backend required learning new technologies.
- Keeping track of enqueing and dequeing and updating it live on the app was a challenge.
