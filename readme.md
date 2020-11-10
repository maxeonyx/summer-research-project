## Setting up Wyvern with IntelliJ

 - Open main folder with IntelliJ
 - File > Project Structure
 - Set project SDK
 - Import wyvern/tools/.project (Eclipse project file) as a module
 - Choose "Link IDEA module with Eclipse project"
 - Add the new .eml file to ".git/info/exclude"
 - Right click on wyvern/tools/build.xml and Add as Ant file.
 - Run the main ant task (copper-generate) and arch-parsers.
 - Right click on the top-level folder and Reload From Disk
 - Build wyvern-tools
