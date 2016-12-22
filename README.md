# LattEngineerAPI
[![Build Status](https://travis-ci.org/LattEngineer/LattEngineerAPI.svg?branch=master)](https://travis-ci.org/LattEngineer/LattEngineerAPI) ![Version](https://img.shields.io/badge/Version-0.0.1--BETA-red.svg) [![License](https://img.shields.io/packagist/l/doctrine/orm.svg)](https://github.com/LattEngineer/LattEngineerAPI/blob/master/LICENSE.md) ![Depend](https://img.shields.io/david/strongloop/express.svg)

LattEngineerAPI is a collection of APIs that help you extend functionality when developing Minecraft plugin.
Key features currently available include simplified Command registration, custom SendMessage, and custom Entity Generation.
For more information, see the project's wiki.

# How can I use?
If you are using Maven, you can write the Source below in pom.xml.

     <dependency>
             <groupId>io.lattenginner</groupId>
             <artifactId>LattEnginnerAPI</artifactId>
             <version>0.0.1-BETA</version>
             <scope>provided</scope>
     </dependency>
    
If you write using character UTF-8:

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

If you use the IDE without using it, add the compiled JAR file as an external library.
In addition to this, you can also use the uploaded source file directly.

# Can I edit and redistribute it?
LattEngineerAPI is released under the MIT Lisense. According to the license, it can be handled by anyone free of charge.
However, you must include the copyright notice and this permission mark on all reproductions or important parts.
In addition, the author or copyright holder is not responsible for the software. Please refer to the license file.

For more information: https://opensource.org/licenses/mit-license.php

# Is there any reference to an external library for the project?
Please refer to the following for the external library. I did not refer to other parts.

- ParticleEffect: See source code comments
- FancyMessage: Copyright (c) 2013-2015 Max Kreminski
- GSON
- JSON

# What if I found a bug or want to support it?
Please use the issue tracker in Github, or contact me by email.

# Offical websites
- LattEngineer website: https://lattengineer.com
- LattEngineerAPI documention: http://dev.lattengineer.com/minecraft-plugins/doc/LattEngineerAPI
- LattEngineerAPI for Jenkins: https://dev.lattengineer.com/jenkins/LattEngineerAPI

# Patch
- v1.1.0
Fixed infinite constructor overloading bug
Fixed Korean(MS949) and Japanese typographical errors in LangConfiguration

- v1.0.2
Added language pack functionality
Added config editor

- v1.0.1
Improved recognition of LattCommand Arguments
Code improvements

- v1.0.0
First release
