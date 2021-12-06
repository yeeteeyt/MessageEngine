package msg.resocurces;
import msg.Main;
import msg.account.Account;
import msg.message.TextMessage;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class database {

        public static Account gemsvido;
        public static Account system;
        public static Account Admin_account;
        public static Account chat;
        public static Account empty;
        public static Account SYSTEM_TOKEN;
        public static ArrayList<Account> accounts;
        public static Account impersonated;
        public static ArrayList<String> ez;
        public static Boolean loaded = false;
        public static ArrayList<String> messageblacklist;


        public static void load () {



                if (!loaded) {
                        Main.debugLine("Info", "Loading database...");

                        // Add Account Data
                        do {
                                Main.debugLine("Info", "Defining preset accounts...");
                                gemsvido = new Account("gemsvido", "please_subscribe", "OWNER", "6b33c874-61bd-4472-a1da-b42d3b121c14");
                                system = new Account("SYSTEM", "12d9e695-4eb3-4567-8a50-d13bf5db9787", "ADMIN", "4b80a385-be1a-4ee6-ac27-831dade116ae");
                                Admin_account = new Account("Administrator", "4f8964fe-57c9-4c7d-a6ad-936d4dd8a3c8", "ADMIN", "4b99fa8a-a87a-4187-bb0a-63329475f8b3");
                                chat = new Account("chat", UUID.randomUUID().toString(), "CHAT", "5af07648-8059-4809-9e74-c2a6a141f286");
                                empty = new Account("Pre-login account", UUID.randomUUID().toString(), "", "");
                                impersonated = new Account("Jimothy", UUID.randomUUID().toString(), "DEFAULT", "");
                                SYSTEM_TOKEN = new Account("SYSTEM_TOKEN", UUID.randomUUID().toString(), "DEFAULT", "");
                                Main.debugLine("Info", "Defined preset accounts.");

                        } while (false);

                        // Add Accounts to ArrayList
                        do {
                                Main.debugLine("Info", "Initializing accounts ArrayList");
                                accounts = new ArrayList<>();
                                Main.debugLine("Info", "Initialized accounts ArrayList");
                                Main.debugLine("Info", "Adding existing accounts to the ArrayList");
                                accounts.add(gemsvido);
                                accounts.add(system);
                                accounts.add(Admin_account);
                                accounts.add(chat);
                                accounts.add(empty);
                                accounts.add(SYSTEM_TOKEN);
                                Main.debugLine("Info", "Added existing accounts to the ArrayList");

                        } while (false);

                        // Add ez messages to ArrayList
                        do {

                                Main.debugLine("Info", "Initializing ez ArrayList");
                                ez = new ArrayList<String>();
                                Main.debugLine("Info", "Initialized ez ArrayList");
                                Main.debugLine("Info", "Adding ez messages to ez ArrayList");
                                ez.add("Wait... This isn't what I typed!");
                                ez.add("Anyone else really like Rick Astley?");
                                ez.add("Hey helper, how play game?");
                                ez.add("Sometimes I sing soppy, love songs in the car.");
                                ez.add("I like long walks on the beach and playing Hypixel");
                                ez.add("Please go easy on me, this is my first game!");
                                ez.add("You're a great person! Do you want to play some Hypixel games with me?");
                                ez.add("In my free time I like to watch cat videos on Youtube");
                                ez.add("When I saw the witch with the potion, I knew there was trouble brewing.");
                                ez.add("If the Minecraft world is infinite, how is the sun spinning around it?");
                                ez.add("Hello everyone! I am an innocent player who loves everything Hypixel.");
                                ez.add("Plz give me doggo memes!");
                                ez.add("I heard you like Minecraft, so I built a computer in Minecraft in your Minecraft so you can Minecraft while you Minecraft");
                                ez.add("Why can't the Ender Dragon read a book? Because he always starts at the End.");
                                ez.add("Maybe we can have a rematch?");
                                ez.add("I sometimes try to say bad things then this happen");
                                ez.add("Behold, the great and powerful, my magnificent and almighty nemisis!");
                                ez.add("Doin a bamboozle fren.");
                                ez.add("Your clicks per second are godly");
                                ez.add("What happens if I add chocolate milk to macaroni and cheese?");
                                ez.add("Can you paint with all the colors of the wind");
                                ez.add("Blue is greener than purple for sure");
                                ez.add("I had something to say, then I forgot it.");
                                ez.add("When nothing is right, go left.");
                                ez.add("I need help, teach me how to play!");
                                ez.add("Your personality shines brighter than the sun.");
                                ez.add("You are very good at the game friend.");
                                ez.add("I like pineapple on my pizza");
                                ez.add("I like pasta, do you prefer nachos?");
                                ez.add("I like Minecraft pvp but you are truly better than me!");
                                ez.add("I have really enjoyed playing with you! <3");
                                ez.add("ILY<3");
                                ez.add("Pineapple doesn't go on pizza!");
                                ez.add("Lets be friends instead of fighting okay?");
                                ez.add("AIDS");
                                ez.add("ILY<3");
                                ez.add("ILY<3");
                                ez.add("ILY<3");
                                ez.add("ILY<3");
                                ez.add("ILY<3");
                                ez.add("uwu");
                                ez.add("uwu");
                                ez.add("i have a short d");
                                ez.add("chat filter?");
                                ez.add("im bad");
                                ez.add("Alex is tall, for sure. No cap.");
                                ez.add("uwu");
                                ez.add("uwu");
                                ez.add("owo");
                                ez.add("Nvidia bread is the future of bread.");
                                ez.add(c.pr + "twitch.tv/gemsvido" + c.rs);
                                ez.add(c.pr + "twitch.tv/gemsvido" + c.rs);
                                ez.add("Subscribe to gemsvido");
                                ez.add("Fortnite sucks balz");
                                ez.add("crack");
                                ez.add("ur mom");
                                ez.add(c.pr + "discord.gg/EMQpumB" + c.rs);
                                ez.add("I'm not a simp, piss off.");
                                ez.add(c.rd + "youtu.be/dQw4w9WgXcQ");
                                ez.add("Wait... This isn't what I typed!");
                                ez.add("Anyone else really like Rick Astley?");
                                ez.add("Hey helper, how play game?");
                                ez.add("Sometimes I sing soppy, love songs in the car.");
                                ez.add("I like long walks on the beach and playing Hypixel");
                                ez.add("Please go easy on me, this is my first game!");
                                ez.add("You're a great person! Do you want to play some Hypixel games with me?");
                                ez.add("In my free time I like to watch cat videos on Youtube");
                                ez.add("When I saw the witch with the potion, I knew there was trouble brewing.");
                                ez.add("If the Minecraft world is infinite, how is the sun spinning around it?");
                                ez.add("Hello everyone! I am an innocent player who loves everything Hypixel.");
                                ez.add("Plz give me doggo memes!");
                                ez.add("I heard you like Minecraft, so I built a computer in Minecraft in your Minecraft so you can Minecraft while you Minecraft");
                                ez.add("Why can't the Ender Dragon read a book? Because he always starts at the End.");
                                ez.add("Maybe we can have a rematch?");
                                ez.add("I sometimes try to say bad things then this happen");
                                ez.add("Behold, the great and powerful, my magnificent and almighty nemisis!");
                                ez.add("Doin a bamboozle fren.");
                                ez.add("Your clicks per second are godly");
                                ez.add("What happens if I add chocolate milk to macaroni and cheese?");
                                ez.add("Can you paint with all the colors of the wind");
                                ez.add("Blue is greener than purple for sure");
                                ez.add("I had something to say, then I forgot it.");
                                ez.add("When nothing is right, go left.");
                                ez.add("I need help, teach me how to play!");
                                ez.add("Your personality shines brighter than the sun.");
                                ez.add("You are very good at the game friend.");
                                ez.add("I like pineapple on my pizza");
                                ez.add("I like pasta, do you prefer nachos?");
                                ez.add("I like Minecraft pvp but you are truly better than me!");
                                ez.add("I have really enjoyed playing with you! <3");
                                ez.add("ILY<3");
                                ez.add("Pineapple doesn't go on pizza!");
                                ez.add("Lets be friends instead of fighting okay?");
                                ez.add("AIDS");
                                ez.add("ILY<3");
                                ez.add("ILY<3");
                                ez.add("ILY<3");
                                ez.add("ILY<3");
                                ez.add("ILY<3");
                                ez.add("rat");
                                ez.add("uwu");
                                ez.add("uwu");
                                ez.add("i have a short d");
                                ez.add("chat filter?");
                                ez.add("im bad");
                                ez.add("Alex is tall, for sure. No cap.");
                                ez.add("uwu");
                                ez.add("uwu");
                                ez.add("owo");
                                ez.add("Nvidia bread is the future of bread.");
                                ez.add(c.pr + "twitch.tv/gemsvido" + c.rs);
                                ez.add(c.pr + "twitch.tv/gemsvido" + c.rs);
                                ez.add("Subscribe to gemsvido");
                                ez.add("Fortnite sucks balz");
                                ez.add("crack");
                                ez.add("ur mom");
                                ez.add(c.pr + "discord.gg/EMQpumB" + c.rs);
                                ez.add("I'm not a simp, piss off.");
                                ez.add(c.rd + "youtu.be/dQw4w9WgXcQ");
                                ez.add("ez?");
                                ez.add("Please give me money -Ivan aka Technoblade");
                                ez.add("Please give me money -Ivan aka Technoblade");
                                Main.debugLine("Info", "Added ez messages to ez ArrayList");


                        } while (false);

                        // Add Message Blacklist
                        do {
                                Main.debugLine("Info", "Initializing message blacklist ArrayList");
                                messageblacklist = new ArrayList<>();
                                Main.debugLine("Info", "Initialized message blacklist ArrayList");
                                Main.debugLine("Info", "Adding blacklisted messages to blacklist ArrayList...");
                                messageblacklist.add("nigga");
                                messageblacklist.add("penis");
                                messageblacklist.add("vagina");
                                messageblacklist.add("anus");
                                messageblacklist.add("sex");
                                messageblacklist.add("porn");
                                messageblacklist.add("testicles");
                                Main.debugLine("Info", "Added blacklisted messages to blacklist ArrayList.");

                        } while (false);

                        loaded = true;

                } else {
                        Main.debugLine("Info", "Database is already loaded. Reload with reload(), or unload with unload()");
                        TextMessage alert_1 = new TextMessage(system, "Database already loaded. To reload, use reload() [801]", Main.loggedin);
                        Main.message(alert_1, Main.n_log);
                }

        }

        public static void unload () {
                Main.debugLine("Info", "Unloading database...");

                if (loaded) {

                        Main.debugLine("Info", "Nulling individual accounts...");
                        gemsvido = null;
                        system = null;
                        Admin_account = null;
                        chat = null;
                        empty = null;
                        impersonated = null;
                        Main.debugLine("Info", "Nulled all individual accounts");

                        Main.debugLine("Info", "Nulling account ArrayList...");
                        accounts = null;
                        Main.debugLine("Info", "Nulled account ArrayList");

                        Main.debugLine("Info", "Nulling ez list...");
                        ez = null;
                        Main.debugLine("Info", "Nulled ez list...");

                        Main.debugLine("Info", "Nulling message blacklist...");
                        messageblacklist = null;
                        Main.debugLine("Info", "Nulled message blacklist...");

                        Main.debugLine("Info", "Confirming loaded status");
                        loaded = false;
                        Main.debugLine("Info", "database.loaded is now false\n");

                        Main.debugLine("Info", "Database successfully unloaded");

                } else {
                        Main.debugLine("Info", "Nevermind. The database wasn't loaded in the first place.");
                        TextMessage alert_2 = new TextMessage(system, "Database is not loaded. To reload, use load() [802]", Main.loggedin);
                        Main.message(alert_2, Main.n_log);
                }
        }

        public static void reload () {
                if (loaded) {
                        Main.debugLine("Info", "Reloading database.");

                        Main.debugLine("Info", "Unloading database...");
                        unload();
                        Main.debugLine("Info", "Unloaded database.");
                        Main.debugLine("Info", "Loading database...");
                        load();
                        Main.debugLine("Info", "Loaded database.");
                        Main.debugLine("Info", "\nSuccessfully reloaded database.");

                } else {
                        Main.debugLine("Info", "Database could not be reloaded as the database isn't loaded.");
                        TextMessage alert_3 = new TextMessage(system, "Database is not loaded. To reload, use load() [803]", Main.loggedin);
                        Main.message(alert_3, Main.n_log);
                }
        }

        public static String returnez () {
                if (loaded) {
                        Main.debugLine("Info", "Returning an ez message...");
                        int random = new Random().nextInt(database.ez.size());
                        return ez.get(random);
                } else {
                        Main.debugLine("Info", "Database needs to be loaded to access ez messages.");
                        System.out.println(c.yw + "Database is not loaded [804]");
                        return null;
                }


        }

        public static String accessSystemToken (String reason) {
                Main.c_log.logcmd("System token was accessed. Reason: " + reason, system);
                return SYSTEM_TOKEN.getPassword();
        }


}