# RestartVirus

RestartVirus is a java based program that will restart a victims pc every 1 hour, note that its just a template and can be used anyway, Im still learning java and this is a fun idea i came up with to increase my knowledge of java. Its not the best and it uses a 2 libraries as i was struggling to do it in plain java. It would be appreciated if you tried to add some things through a pull request


## Usage

It uses [Zip4j](https://github.com/srikanth-lingala/zip4j) and [Apache Common Utils](https://commons.apache.org/proper/commons-io/download_io.cgi?Preferred=https%3A%2F%2Fdownloads.apache.org%2F), import them as libraries and you should be good to go
You can just run a jar and it will automatically install all the files

***Im not responsible if you use it maliciously like using it with a botnet or distributing it illegally***


## File it creates as a worm
1. It creates a jar file in Windows startup folder so it can run on windows startup
2. It creates a zip file in %appdata% folder, its temporary as it is used to copy the InputStream to a file and extract it to desired paths
3. In resources folder it contains the jar which will be permanently injected to the victims computer, its a modified jar with the same path as above but just with the restart timer
## What if I'm Infected
Well...
You can try checking the paths mentioned above
**If you need any help dm me on discord or open a issue** Discord- Momin#7755
