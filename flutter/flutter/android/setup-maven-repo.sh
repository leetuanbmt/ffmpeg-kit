#!/bin/bash

# Create Maven repository structure
mkdir -p libs/com/arthenica/ffmpeg-kit-https/6.0-2
mkdir -p libs/com/arthenica/smart-exception-java/0.2.1
mkdir -p libs/com/arthenica/smart-exception-common/0.2.1

# Move and rename files to Maven structure
mv libs/ffmpeg-kit-https-6.0-2.aar libs/com/arthenica/ffmpeg-kit-https/6.0-2/ffmpeg-kit-https-6.0-2.aar
mv libs/smart-exception-java-0.2.1.jar libs/com/arthenica/smart-exception-java/0.2.1/smart-exception-java-0.2.1.jar
mv libs/smart-exception-common-0.2.1.jar libs/com/arthenica/smart-exception-common/0.2.1/smart-exception-common-0.2.1.jar

# Create POM files
cat > libs/com/arthenica/ffmpeg-kit-https/6.0-2/ffmpeg-kit-https-6.0-2.pom << EOF
<?xml version="1.0" encoding="UTF-8"?>
<project xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd" xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.arthenica</groupId>
  <artifactId>ffmpeg-kit-https</artifactId>
  <version>6.0-2</version>
  <packaging>aar</packaging>
</project>
EOF

cat > libs/com/arthenica/smart-exception-java/0.2.1/smart-exception-java-0.2.1.pom << EOF
<?xml version="1.0" encoding="UTF-8"?>
<project xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd" xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.arthenica</groupId>
  <artifactId>smart-exception-java</artifactId>
  <version>0.2.1</version>
  <packaging>jar</packaging>
</project>
EOF

cat > libs/com/arthenica/smart-exception-common/0.2.1/smart-exception-common-0.2.1.pom << EOF
<?xml version="1.0" encoding="UTF-8"?>
<project xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd" xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.arthenica</groupId>
  <artifactId>smart-exception-common</artifactId>
  <version>0.2.1</version>
  <packaging>jar</packaging>
</project>
EOF

echo "Maven repository structure created successfully!" 