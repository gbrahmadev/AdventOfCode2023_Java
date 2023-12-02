package Day2;

public class Part1 {
	public static void main(String[] args) {
		String input = "Game 1: 1 red, 5 blue, 1 green; 16 blue, 3 red; 6 blue, 5 red; 4 red, 7 blue, 1 green\n"
				+ "Game 2: 4 blue; 4 red, 3 blue, 1 green; 4 red, 9 blue, 2 green; 5 blue, 7 green, 4 red\n"
				+ "Game 3: 10 blue; 7 blue, 1 green; 19 blue, 1 green, 9 red\n"
				+ "Game 4: 2 green; 14 blue, 14 red, 4 green; 12 red, 11 green, 13 blue; 5 green, 9 red, 4 blue; 9 red, 7 green, 12 blue; 2 green, 3 blue, 8 red\n"
				+ "Game 5: 3 blue, 4 red; 12 red, 2 green, 15 blue; 1 red, 10 blue, 1 green\n"
				+ "Game 6: 1 blue, 7 red; 3 green, 5 red, 1 blue; 1 green, 7 red; 6 red, 1 blue, 4 green; 1 green, 8 red, 1 blue; 2 green, 4 red, 1 blue\n"
				+ "Game 7: 11 green, 10 blue, 2 red; 1 green, 12 blue, 2 red; 9 green, 14 blue; 1 red, 19 blue, 15 green\n"
				+ "Game 8: 4 green, 2 red, 14 blue; 9 green, 1 red, 15 blue; 2 green, 9 red, 8 blue; 11 green, 7 red, 8 blue; 9 red, 7 green, 6 blue\n"
				+ "Game 9: 4 blue, 1 green, 2 red; 1 blue, 3 red; 1 red, 3 blue, 3 green\n"
				+ "Game 10: 4 red, 3 green, 6 blue; 2 green, 15 blue, 6 red; 3 green, 2 blue; 2 red, 1 green; 11 blue, 7 red, 4 green; 2 blue, 2 red, 4 green\n"
				+ "Game 11: 10 red, 1 green, 7 blue; 5 red, 2 green, 7 blue; 2 green, 4 blue; 1 green, 10 red, 10 blue; 8 blue, 4 red\n"
				+ "Game 12: 6 green, 2 blue, 7 red; 3 green, 2 blue, 3 red; 6 red, 1 blue, 9 green; 9 green, 13 red, 5 blue; 6 green, 4 blue, 8 red\n"
				+ "Game 13: 10 green, 4 red, 6 blue; 19 red, 6 green, 7 blue; 6 blue, 5 red, 8 green\n"
				+ "Game 14: 4 blue, 2 green; 19 blue; 6 red, 17 blue; 10 blue, 7 red; 1 green, 2 blue, 7 red\n"
				+ "Game 15: 4 green, 12 blue, 15 red; 10 blue, 18 green, 13 red; 20 blue, 6 green, 10 red; 20 red, 12 blue, 13 green; 12 blue, 17 green, 10 red; 1 red, 3 blue, 7 green\n"
				+ "Game 16: 1 blue, 6 red, 5 green; 3 red, 3 green; 5 green, 1 red; 2 red, 1 blue, 6 green; 1 blue, 1 red, 6 green; 1 blue, 6 green\n"
				+ "Game 17: 4 red, 3 blue, 3 green; 8 blue, 8 green; 5 red, 3 green, 9 blue; 9 green, 12 blue, 13 red; 1 green, 1 blue, 5 red; 7 green, 6 red\n"
				+ "Game 18: 2 green, 11 blue, 6 red; 2 green, 11 red, 2 blue; 7 red, 4 blue, 9 green; 18 blue, 6 red, 1 green\n"
				+ "Game 19: 4 red, 7 green, 17 blue; 5 green, 6 red, 4 blue; 4 blue, 4 red, 1 green\n"
				+ "Game 20: 2 blue, 5 green, 9 red; 4 green, 8 red, 10 blue; 7 blue, 9 red, 1 green; 1 green, 10 blue, 9 red; 1 green, 8 red; 8 blue, 8 red, 1 green\n"
				+ "Game 21: 1 blue, 14 red; 1 green, 2 red; 9 red, 1 blue, 1 green\n"
				+ "Game 22: 7 green, 9 red, 4 blue; 9 red, 7 green, 9 blue; 8 green, 14 red; 5 blue; 10 red, 1 blue, 1 green; 8 green\n"
				+ "Game 23: 2 red, 12 green, 5 blue; 3 red, 5 blue, 3 green; 1 red, 9 green, 1 blue; 8 green, 6 blue; 13 green\n"
				+ "Game 24: 8 red, 7 green, 1 blue; 1 red, 6 green, 7 blue; 1 green, 3 red\n"
				+ "Game 25: 4 green, 2 red; 1 red, 2 green, 8 blue; 1 green; 8 blue\n"
				+ "Game 26: 1 green, 4 blue, 17 red; 15 red, 3 green, 3 blue; 2 blue, 2 red; 18 red, 2 green, 11 blue; 6 red, 7 blue; 10 blue, 1 green, 4 red\n"
				+ "Game 27: 2 red, 5 blue, 1 green; 14 green, 2 red, 6 blue; 1 red, 4 blue, 14 green\n"
				+ "Game 28: 3 red, 5 green, 2 blue; 2 red, 3 green, 4 blue; 1 red, 9 green, 3 blue; 13 green, 4 red, 4 blue\n"
				+ "Game 29: 18 red, 11 green; 4 blue, 18 red, 9 green; 16 red, 2 green, 4 blue; 2 red, 3 blue, 12 green; 1 green, 18 red; 2 blue, 15 green, 1 red\n"
				+ "Game 30: 10 red, 3 blue, 1 green; 6 red, 1 blue, 3 green; 2 green, 2 blue, 10 red; 6 green; 3 blue, 15 red\n"
				+ "Game 31: 1 blue, 7 green, 2 red; 12 red, 8 green, 4 blue; 2 green, 2 blue, 5 red; 2 blue, 3 green, 12 red; 7 red, 5 green, 4 blue; 7 red, 1 blue\n"
				+ "Game 32: 4 blue, 5 red, 11 green; 20 red, 8 green, 1 blue; 10 red, 7 green, 1 blue; 1 blue, 7 red, 2 green; 1 red, 19 green, 3 blue\n"
				+ "Game 33: 9 red; 9 red, 6 green, 7 blue; 5 red, 7 blue, 2 green\n"
				+ "Game 34: 5 green, 5 red, 3 blue; 8 green, 6 blue, 16 red; 12 blue, 8 red, 8 green; 1 blue, 10 red, 3 green; 1 green, 13 blue, 18 red; 4 blue, 5 green, 8 red\n"
				+ "Game 35: 15 green, 4 red, 8 blue; 7 red, 1 green, 14 blue; 12 green, 16 blue, 2 red\n"
				+ "Game 36: 3 blue, 3 green, 2 red; 7 red, 8 blue; 11 blue, 9 red; 4 red, 13 blue, 1 green\n"
				+ "Game 37: 4 red, 11 blue, 8 green; 6 green, 4 blue, 14 red; 5 blue, 7 green, 13 red; 6 red, 2 green, 5 blue; 4 red, 3 blue, 1 green; 6 red, 4 green, 6 blue\n"
				+ "Game 38: 10 green, 5 blue, 1 red; 3 red, 6 blue, 3 green; 9 green, 9 blue, 3 red; 9 blue, 1 red, 6 green\n"
				+ "Game 39: 3 blue, 16 red; 10 red, 4 green, 2 blue; 2 blue, 13 red, 1 green; 2 blue, 11 red, 2 green; 3 green, 13 red\n"
				+ "Game 40: 2 blue, 3 red, 2 green; 2 green, 2 blue, 6 red; 1 green, 9 red\n"
				+ "Game 41: 1 blue, 12 red; 8 blue, 1 red, 5 green; 1 green, 7 blue, 13 red; 8 red, 7 blue, 7 green; 4 green, 17 red, 9 blue; 2 green, 8 blue\n"
				+ "Game 42: 2 green, 6 red, 1 blue; 3 red, 2 green; 9 red, 1 green; 2 red, 2 green\n"
				+ "Game 43: 10 blue, 9 red; 14 blue, 4 green; 5 red, 3 green, 9 blue; 5 blue, 8 green, 1 red\n"
				+ "Game 44: 3 blue, 10 green, 1 red; 1 blue, 13 red, 3 green; 1 blue, 5 green, 16 red\n"
				+ "Game 45: 1 red, 1 green, 3 blue; 2 green, 1 red, 5 blue; 1 red, 2 blue, 1 green; 1 blue; 1 green, 5 blue; 1 blue\n"
				+ "Game 46: 8 green, 8 blue, 4 red; 10 green, 4 red, 7 blue; 2 red, 3 green, 14 blue\n"
				+ "Game 47: 3 green, 3 red; 5 green, 2 blue, 6 red; 3 blue, 5 red, 15 green; 2 green, 2 blue, 2 red\n"
				+ "Game 48: 11 blue, 12 green, 3 red; 8 blue, 3 red, 3 green; 1 green, 6 blue, 2 red\n"
				+ "Game 49: 3 blue, 17 green, 1 red; 4 red, 16 blue, 17 green; 1 green, 3 red, 5 blue; 14 blue, 1 red, 12 green\n"
				+ "Game 50: 2 blue, 5 red, 6 green; 8 blue, 11 green, 5 red; 2 green, 2 red, 6 blue\n"
				+ "Game 51: 1 green, 2 red; 4 green; 1 blue, 10 green\n"
				+ "Game 52: 8 blue, 9 red, 4 green; 2 green, 8 blue, 2 red; 1 red, 2 green, 1 blue; 2 blue, 8 green, 8 red; 4 red, 1 green, 9 blue; 11 blue, 4 green, 8 red\n"
				+ "Game 53: 1 green, 2 red; 3 blue, 1 green, 9 red; 5 blue, 11 red; 4 blue, 6 red, 1 green; 5 blue, 10 red; 5 blue, 5 red, 1 green\n"
				+ "Game 54: 1 blue, 8 green; 9 green, 1 red, 11 blue; 16 green, 8 blue; 5 green\n"
				+ "Game 55: 7 blue, 2 red, 1 green; 16 green, 19 blue, 5 red; 9 green, 3 blue, 7 red; 8 blue, 2 green, 4 red; 8 green, 15 blue, 5 red\n"
				+ "Game 56: 9 blue, 1 red, 4 green; 12 green, 12 blue; 1 green, 1 red, 5 blue\n"
				+ "Game 57: 1 green, 10 blue; 1 red, 9 blue; 10 blue, 1 red, 3 green\n"
				+ "Game 58: 6 red, 15 blue, 3 green; 13 blue, 5 red; 10 blue, 2 red; 5 red, 1 green, 14 blue\n"
				+ "Game 59: 7 red, 1 blue, 9 green; 4 green, 12 red, 2 blue; 6 green, 20 red, 1 blue; 4 blue, 9 red, 2 green; 8 red, 4 blue, 2 green\n"
				+ "Game 60: 11 red, 8 blue, 1 green; 18 green, 11 blue; 16 red, 10 blue, 7 green; 6 blue, 8 red; 7 red, 15 green, 4 blue\n"
				+ "Game 61: 1 blue, 1 green, 8 red; 3 red, 7 blue; 4 blue, 10 red; 1 green, 5 red, 8 blue; 10 red, 7 blue\n"
				+ "Game 62: 12 blue, 1 red, 1 green; 2 green, 1 red, 7 blue; 3 green, 18 blue; 11 blue, 4 green\n"
				+ "Game 63: 4 green, 4 red, 8 blue; 7 red, 5 blue, 5 green; 2 green, 20 blue, 4 red; 1 green, 4 blue, 3 red\n"
				+ "Game 64: 2 green, 2 red; 3 green, 2 blue; 12 green, 2 red, 4 blue; 5 red, 9 green, 8 blue; 7 blue, 6 green; 3 green, 5 red\n"
				+ "Game 65: 8 red, 2 green, 13 blue; 11 blue; 7 blue, 2 green; 12 blue, 1 green, 9 red\n"
				+ "Game 66: 1 blue, 3 red, 19 green; 3 red, 17 blue, 15 green; 9 green, 9 blue\n"
				+ "Game 67: 2 green, 7 blue, 1 red; 3 green, 1 red, 7 blue; 1 red, 6 green; 7 blue, 2 red, 10 green; 2 red, 5 green, 4 blue\n"
				+ "Game 68: 14 red, 10 green, 8 blue; 11 red, 1 blue, 6 green; 7 red, 7 green; 12 blue, 10 green, 3 red; 6 red, 12 blue, 10 green; 8 green, 14 red, 3 blue\n"
				+ "Game 69: 4 green, 8 red; 2 red, 15 green; 5 red, 1 blue, 12 green; 13 red, 6 green; 10 green, 13 red, 1 blue\n"
				+ "Game 70: 3 red, 10 blue, 3 green; 8 red, 11 blue, 11 green; 5 red, 13 green\n"
				+ "Game 71: 18 green, 3 red, 1 blue; 3 blue, 14 green, 2 red; 6 blue, 20 green, 4 red\n"
				+ "Game 72: 2 blue, 1 red; 2 blue, 3 green, 1 red; 4 blue, 2 red, 4 green\n"
				+ "Game 73: 11 red, 11 green; 5 green, 1 blue; 8 red, 7 green, 4 blue; 5 blue, 7 red, 12 green\n"
				+ "Game 74: 12 red, 12 green, 5 blue; 10 red, 7 blue, 15 green; 6 green, 19 red, 19 blue; 3 red, 7 blue, 16 green; 11 red, 14 green, 16 blue\n"
				+ "Game 75: 5 red, 17 green, 8 blue; 10 red, 8 blue, 19 green; 9 blue, 6 red, 18 green; 3 blue, 13 red, 12 green\n"
				+ "Game 76: 5 green, 2 red, 8 blue; 3 blue, 14 red, 2 green; 14 red, 1 blue; 3 green, 8 blue, 15 red; 11 red, 1 green; 11 red, 9 blue, 3 green\n"
				+ "Game 77: 3 blue, 2 red; 1 blue, 8 green, 11 red; 14 green, 14 red; 3 red, 5 green, 5 blue; 2 green, 16 blue, 3 red; 13 red, 7 green, 5 blue\n"
				+ "Game 78: 3 blue, 1 green, 1 red; 5 blue, 1 green, 1 red; 9 blue, 7 red, 1 green; 5 blue, 1 green, 5 red; 10 blue, 3 green, 7 red\n"
				+ "Game 79: 19 green, 17 blue, 4 red; 7 green, 7 red, 16 blue; 4 red, 10 green; 13 blue, 17 green, 2 red\n"
				+ "Game 80: 9 blue, 3 green; 15 blue, 1 red; 3 blue, 12 green, 2 red; 1 red, 14 green, 13 blue; 1 red, 10 blue, 16 green; 8 blue, 6 green, 2 red\n"
				+ "Game 81: 1 green, 3 red, 19 blue; 2 red, 1 green, 9 blue; 1 green, 2 red, 8 blue; 1 red, 1 green, 11 blue; 1 green, 3 red, 11 blue\n"
				+ "Game 82: 8 red, 1 blue, 4 green; 9 green, 3 blue, 4 red; 3 green, 3 blue, 18 red\n"
				+ "Game 83: 3 red, 13 blue, 16 green; 16 green, 2 blue; 14 green, 12 blue; 8 green, 14 blue, 4 red; 12 green, 4 blue; 20 green, 1 red\n"
				+ "Game 84: 4 green, 4 blue, 5 red; 6 red, 6 blue, 8 green; 5 blue, 12 green, 3 red; 5 red, 13 green; 6 blue, 1 green, 5 red\n"
				+ "Game 85: 10 green; 7 green, 1 blue; 5 red, 5 blue, 1 green; 2 green, 2 red, 3 blue; 3 red, 10 green, 3 blue; 1 blue, 1 red\n"
				+ "Game 86: 3 green, 1 red, 3 blue; 2 red, 2 green; 9 green, 2 blue, 3 red; 3 red, 3 blue, 4 green\n"
				+ "Game 87: 6 red, 4 green; 1 red, 3 green, 5 blue; 1 green, 7 blue, 4 red\n"
				+ "Game 88: 2 green, 4 red, 3 blue; 5 green, 1 blue; 3 red, 5 green, 2 blue; 1 green, 6 red, 1 blue; 7 red, 2 blue; 17 red, 13 green\n"
				+ "Game 89: 4 green, 2 blue, 6 red; 15 red, 7 green, 10 blue; 7 red, 9 blue, 4 green\n"
				+ "Game 90: 9 red, 17 blue; 1 green, 9 blue; 5 red, 8 blue; 3 blue, 9 red, 1 green; 17 blue, 1 red\n"
				+ "Game 91: 7 green, 3 red, 5 blue; 4 blue, 3 red, 9 green; 9 red, 7 blue, 7 green; 5 red, 6 blue, 3 green; 10 red, 2 green, 6 blue\n"
				+ "Game 92: 13 blue, 8 red; 7 green, 1 red, 8 blue; 5 blue, 4 red, 2 green; 9 red, 10 blue\n"
				+ "Game 93: 6 green; 1 blue, 16 green, 6 red; 5 green, 1 blue, 5 red; 5 red, 6 green; 16 green, 2 red, 1 blue; 11 green, 2 red\n"
				+ "Game 94: 9 blue, 4 green; 12 green, 17 blue; 4 green, 5 blue, 6 red; 2 red, 2 blue, 12 green\n"
				+ "Game 95: 5 red, 4 blue, 5 green; 2 blue, 4 green, 4 red; 4 blue, 2 red, 7 green; 1 green, 7 blue, 8 red\n"
				+ "Game 96: 7 blue, 6 green, 2 red; 3 green, 1 blue; 7 blue, 3 red, 5 green; 1 green, 5 blue; 6 blue, 2 red; 2 green, 1 red\n"
				+ "Game 97: 10 red, 1 green, 1 blue; 4 green, 11 red, 2 blue; 4 red, 1 blue, 4 green\n"
				+ "Game 98: 3 green, 4 blue, 7 red; 7 red, 8 green; 7 green, 16 red, 1 blue; 8 green, 2 blue, 4 red; 5 green, 3 blue, 18 red\n"
				+ "Game 99: 6 green, 12 red, 1 blue; 5 blue, 1 red, 7 green; 5 green, 7 red, 10 blue; 8 blue, 1 red, 7 green; 17 red, 4 blue, 9 green\n"
				+ "Game 100: 6 blue, 10 green; 3 green, 4 blue, 1 red; 7 blue, 1 red, 12 green";

		String[] rounds = input.trim().split("\n");
		int sum = 0;

		ROUND: for (String round : rounds) {

			String[] gameString = round.trim().split(":");
			String[] gameNumber = gameString[0].trim().split(" ");
			String[] gameSets = gameString[1].trim().split(";");

			boolean flag = true;

			GAMESET: for (String set : gameSets) {
				int red = 0, green = 0, blue = 0;
				String[] cubes = set.trim().split(",");
//				populateCubeCountForASet(cubes);
				for (String cube : cubes) {
					String[] cubeCount = cube.trim().split(" ");
					switch (cubeCount[1].trim()) {
					case "red":
						red = Integer.parseInt(cubeCount[0]);
						break;
					case "green":
						green = Integer.parseInt(cubeCount[0]);
						break;
					case "blue":
						blue = Integer.parseInt(cubeCount[0]);
						break;
					default:
						break;
					}
				}

				if (red > 12 || green > 13 || blue > 14) {
					flag = false;
					continue ROUND;
				}

			}
			if (flag) {
				sum += Integer.parseInt(gameNumber[1]);
			}

		}

		System.out.println(sum);
	}

}
