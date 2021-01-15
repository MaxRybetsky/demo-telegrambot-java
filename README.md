# Demo Telegram Bot
Simple Telegram Bot:
<ul>
<li>Collects applications from users;</li>
<li>Notifies admin about new users;</li>
<li>Supports special admin commands (<b><i>broadcast</i></b> for sending notifications to all users and <b><i>users</i></b> for getting list of all users in database);</li>
<li>Saves new users in database.</li>
</ul>
First user wrote to the bot is <b>admin</b>.
<br><br>
You can play with the bot <a href="https://t.me/regDemoBot" target="blank">here</a>.
<br><br>
The bot created by following steps of <a href="https://www.youtube.com/watch?v=--6ydjM09Zk&t=261s" target="blank">this manual</a>.
<br><br>
To run the bot you should:
<ol>
  <li>Clone this code;</li>
  <li><b>Fill two property files</b> (src/main/resources/application.properties and src/main/resources/telegram.properties) by your own settings;</li>
  <li>Start main method <code>com.github.rybetsky.telegrambot.TelegramBotApplication#main</code>.</li>
</ol>
