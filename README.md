# Activity Suggestion Based on Temperature

This project is a simple Java-based program that suggests an activity to do based on the current temperature. The program takes the temperature as input and provides an activity suggestion such as skiing, going to the cinema, having a picnic, or swimming.

## Features

- Takes the temperature as input from the user.
- Provides an activity suggestion based on the given temperature.
- Uses a switch-case statement to determine the activity based on temperature ranges.

## Temperature-Based Activity Suggestions

The program provides suggestions based on the following temperature ranges:

- **Below 5°C**: You can go skiing.
- **Between 5°C and 14°C**: You can go to the cinema.
- **Between 15°C and 24°C**: You can go for a picnic.
- **25°C and above**: You can go swimming.

## Usage

The program runs in the command line and interacts with the user to provide a suitable activity suggestion. Here is how it works:

1. The user is prompted to enter the current temperature.
2. Based on the input temperature, one of the following suggestions is displayed:
   - Skiing
   - Going to the cinema
   - Having a picnic
   - Swimming

## How to Run

To run this project, you need to have Java installed on your computer. Follow these steps:

1. Save the `Main.java` file.
2. Open a terminal and navigate to the directory where the file is saved.
3. Compile the program using the following command:

   ```sh
   javac Main.java
   ```

4. Run the program using the following command:

   ```sh
   java Main
   ```

5. Follow the prompt to enter the temperature.

## Example Output

```
Hava sıcaklığını giriniz:
10
Sinemaya gidebilirsiniz
```

Or for a higher temperature:

```
Hava sıcaklığını giriniz:
30
Yüzmeye gidebilirsiniz
```

## Code Overview

- **User Input**: The program takes the temperature input from the user using the `Scanner` class.
- **Ternary Operation**: The temperature is analyzed using nested ternary operations to determine the range.
- **Switch Statement**: A switch-case statement is used to suggest an activity based on the temperature range.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

- **Hekim Can Aktas** - [GitHub](https://github.com/hekimcanaktas)

