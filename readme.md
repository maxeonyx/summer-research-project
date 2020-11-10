# Summer Research Project - Integrating purity-checked java code with Wyvern

## Setting up this project

- Clone with submodules - Wyvern is included as a submodule.
- Unzip the checker-framework zip file into a top-level folder with the same name

## Setting up Wyvern with IntelliJ

 - Open main folder with IntelliJ
 - File > Project Structure
 - Set project SDK
 - Import wyvern/tools/.project (Eclipse project file) as a module
 - Choose "Link IDEA module with Eclipse project"
 - Add the new .eml file to ".git/info/exclude"
 - Right click on wyvern/tools/build.xml and Add as Ant file.
 - Run the main ant task (copper-generate) and arch-parsers.
 - Right click on the top-level wyvern folder and Reload From Disk
 - Build wyvern-tools
