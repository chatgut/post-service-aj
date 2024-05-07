  usersapp:
    image: ghcr.io/chatgut/userservice:1.0
    container_name: userservice
    ports:
      - "8002:8002"
    depends_on:
      - dbUsers
    environment:
      DB_URL: jdbc:mysql://dbUsers:3306/userService
      DB_USER: developer
      DB_PASSWORD: password

  dbUsers:
    image: mysql:latest
    environment:
      MYSQL_ROOT_HOST: '%'
      MYSQL_ROOT_USER: root
      MYSQL_ROOT_PASSWORD: password
      MYSQL_DATABASE: userService
      MYSQL_PASSWORD: password
      MYSQL_USER: developer
    volumes:
      - dbUsers:/var/lib/mysql

volumes:
  dbUsers: