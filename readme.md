# Summer Research Project - Integrating purity-checked java code with Wyvern

## Setting up this project

- Clone with submodules - Wyvern is included as a submodule.
- Unzip the checker-framework zip file into a top-level folder with the same name
- Copy checker-framework-x.x.x/checker/dist/checker-qual.jar to wyvern/tools/lib

### Project dependencies
- Wyvern code demos (allowed.wyv, not-allowed.wyv)
    - Java code (PureLib.java, ImpureLib.java)
        - Javac with checker processor
        - checker-qual.jar
    - Wyvern compiler (wyvern-tools)
        - checker-qual.jar

### Setting up Wyvern with IntelliJ

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
