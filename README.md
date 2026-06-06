# Consecutive MLG Challenge Mod
By SlimeyGrandiose aka ThrilledBaboon
## Gameplay
The mod creates an endless MLG clutch challenge.
1. The player is teleported 45-200 blocks into the air.
2. They are given:
   - 64 Cobwebs (replenished each attempt)
   - 1 Water Bucket (replenished each attempt)
   - 3 Ender Pearls (shared across the current run and not replenished after use)
3. The player attempts to survive the fall.
4. If successful, their streak increases and statistics are updated.
5. If they fail, the streak resets and statistics are updated.
6. A new attempt begins when prompted.

A successful attempt is recorded when the player survives the fall.

A failed attempt is recorded when the player dies before the next teleport.

## Credits
This project was inspired by the MLG Challenge mod created by CrazyMapleSaltedButter (Maple) for Shurmanation (Shurm).
Maple allowed me to view the repository for reference. No code from that project is being copied into this mod, though some implementation details might be similar because both projects implement a similar core concept.

## What I plan on doing differently to Maples Mod
There are some important features that I wish Maple's mod included which are basically just all stats based.

### Session Tracking
Based on the discussion in stream, I think it would be cool to also see the stats from each individual stream, so we could see his improvements between each stream.
My idea to solve this is change in how the stats are collected, I'm thinking of 3 different stats views:

#### Ranked Session
Ranked sessions count toward:
- Personal Best streaks
- Ranked statistics
- Lifetime Ranked progress
  
#### Practice Session
Practice sessions:
- Allow modified settings
- Record all stats to lifetime stats
- Do not affect ranked streaks or PBs

#### Lifetime Statistics
Lifetime statistics track all attempts across every session, including both Ranked and Practice sessions.
These statistics include:
- Total Attempts
- Total Successes
- Total Failures
- Overall Success Rate

### Expanded Stats
Currently Maple only tracks: Deaths and Current Streak. 
I think this is very limited during the stream Shurm also said it would be cool if there were more stats to look at.
I was also saying I agree and was hoping to see Maple agree to add them. 
He didn't really respond so I will be including them in my mod.
I will be adding:
- Attempts, this will be the total number of attempts that have happened.
- Failures, this is basically the death count and I might still call it deaths.
- Successes, total number of successful clutches.
- Success Rate, this is just a percentage of attempts that were successful. Ideally I can make this in a graph and we can see success rate increase over time.
- Current Streak, the player's current consecutive successful clutches.
- Personal Best (PB), the highest consecutive streak achieved.
- Longest Practice Streak, the highest streak achieved in practice mode.
- Average Streak Length, the average number of successful clutches achieved before a failure.
- Water Bucket Successes, percentage of successes that were water bucket clutches.
- Cobweb Successes, percentage of successes that were cobweb clutches,
- Ender Pearl Successes, percentage of successes that were ender pearl clutches.

### Benefits of Session Tracking
The expanded statistics and sessions tracking allow players to:
- see more stats
- track progress over time
- and be able to practice without ruining stats.
  
#### Future improvements for the stats views
For the future, I think including graphs to show the stats over time, and being able to directly compare sessions would be very cool. I think this might have to be done with a webserver though as in game graphs and the like could be too weird.

## Inspiration
### Why this mod is getting made?
Basically I wanted to make a mod since I learned how to code in about 2018/2019, but I never bothered to get around it it- my ideas were to grand(iose). 
Recently, I started tuning into streams by Shurm.
Then a few days later Shurm started his new challenge to get 100 MLG clutches consecutively, and he was using of a bespoke mod by Maple.
This made me remember,
"OMG, I should make a Minecraft mod!"
and I decided that the mod that Shurm was using was of decent size and decent complexity for what would be my first Minecraft mod.
So I'm trying to remake the same mod that Maple made for him.

### Additional Notes
Maple did give me access to his repo. I am not going to be copying his code, but due to the nature of making the same mod I imagine some of the code will look similar.
I have very loosely looked at the mods source code he made because I wanted to see what sort of statistics he had implemented. 
In an ideal world Shurmanation continues to use the mod made by Maple and my mod will just be for my experience making a mod. 
But my intended features I want to implement I am hoping to be improvements on Maples.

