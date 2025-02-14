# Spotify Account Signup and Playlist Automation

This project automates the process of signing up for a new Spotify account, creating a playlist, adding songs to it, and playing the playlist using **Shaft_Engine** and **Selenium** in Java. The project is built using the **Page Object Model (POM)** design pattern and **Fluent Design** principles for maintainability and readability.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Demo Video](#demo-video)
- [Prerequisites](#prerequisites)
- [Setup](#setup)

---

## Overview

This automation script performs the following tasks:
1. **Signs up** for a new Spotify account.
2. **Logs in** to the newly created account.
3. **Creates a playlist** and adds a song to it.
4. **Plays the playlist** on Spotify's web player.

The project is built using **Shaft_Engine**, a powerful test automation framework, and **Selenium WebDriver** for browser automation.

---

## Features

- **Account Signup**: Automates the Spotify account creation process.
- **Playlist Creation**: Creates a new playlist and adds songs to it.
- **Playback**: Plays the created playlist on Spotify's web player.
- **Logging**: Uses Shaft_Engine integrated with `Allure Report` for detailed logging and reporting.

---

## Demo Video

Watch the automation script in action:

[![Watch Video](https://img.shields.io/badge/Watch%20Video-Click%20Here-blue)](https://drive.google.com/file/d/1tTiqh2ZMBSekHmFkrIp5t7QQAW8PuXyg/view?usp=sharing)

## Prerequisites

Before running the project, ensure you have the following installed:

1. **Java Development Kit (JDK)**: Version 8 or higher.
2. **Maven**: For dependency management.
3. **Shaft_Engine**: Ensure the Shaft_Engine dependency is added to your `pom.xml`.

---

## Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/spotify-automation.git
   cd spotify-automation
