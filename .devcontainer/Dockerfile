FROM openjdk:17-slim-bullseye

LABEL maintainer="Rodrigo Dantas"
LABEL email="rodrigodantas.91@gmail.com"

# Update image and install needed packages
RUN apt update -y
RUN apt install maven git python3 unzip curl coreutils -y

# Git Config
RUN git config --global user.name "Rodrigo Dantas"
RUN git config --global user.email "rodrigodantas.91@gmail.com"
RUN git config --global http.sslVerify false
RUN git config --global http.postBuffer 1048576000

WORKDIR /app
CMD tail -f /dev/null

EXPOSE 8080