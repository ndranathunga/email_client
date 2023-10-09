# Email Client

This GitHub repository contains a simple Java-based email client application. The application allows users to manage a list of recipients, send emails, and perform various operations related to recipient management and email sending.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)

## Overview

The Email Client is a command-line application designed to help users manage a list of recipients and send emails. It provides functionality to add new recipients, send emails, retrieve recipients with birthdays on a specific date, and print details of sent emails. The application also displays the total number of recipient objects currently in the system.

## Features

### 1. Adding a New Recipient
- Users can add a new recipient by providing their details in the following format:
  ```
  Official: Name,Email,Position
  Personal: Name,Email,Birthday
  Office_friend: Name,Email,Birthday,Company
  ```
- Recipient details are stored in a text file named `clientList.txt`.

### 2. Sending an Email
- Users can send an email by providing the recipient's email address, subject, and content.

### 3. Printing Recipients with Birthdays
- Users can input a date in the format `yyyy/MM/dd` to print recipients who have birthdays on that date.

### 4. Printing Details of Sent Emails
- Users can input a date in the format `yyyy/MM/dd` to print the details of all emails sent on that date.

### 5. Displaying the Number of Recipient Objects
- Users can view the total number of recipient objects currently in the application.

## Getting Started

To get started with the Email Client application, follow these steps:

1. Clone the repository to your local machine.
   ```bash
   git clone https://github.com/your-username/email-client.git
   ```

2. Compile the Java source code:
   ```bash
   javac Email_Client.java
   ```

3. Create an empty `clientList.txt` file in the same directory where the application is located.

4. Run the application:
   ```bash
   java Email_Client
   ```

## Usage

Once you have started the Email Client, you will be prompted to select an option:

1. **Adding a New Recipient:** Enter `1` to add a new recipient. Follow the input format provided in the application.

2. **Sending an Email:** Enter `2` to send an email. Follow the input format for email, subject, and content.

3. **Printing Recipients with Birthdays:** Enter `3` to print recipients who have birthdays on a specific date (in `yyyy/MM/dd` format).

4. **Printing Details of Sent Emails:** Enter `4` to print details of all emails sent on a specific date (in `yyyy/MM/dd` format).

5. **Displaying the Number of Recipient Objects:** Enter `5` to view the total number of recipient objects in the application.
