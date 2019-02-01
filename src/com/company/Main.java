package com.company;
import java.util.*;

public class Main {

    static List<HTMLColors> colorList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void LoadColors()
    {
        colorList.add(new HTMLColors(0, "AliceBlue", "F0F8FF"));
        colorList.add(new HTMLColors(1, "AntiqueWhite", "FAEBD7"));
        colorList.add(new HTMLColors(2, "Aqua", "00FFFF"));
        colorList.add(new HTMLColors(3, "Aquamarine", "7FFFD4"));
        colorList.add(new HTMLColors(4, "Azure", "F0FFFF"));
        colorList.add(new HTMLColors(5, "Beige", "F5F5DC"));
        colorList.add(new HTMLColors(6, "Bisque", "FFE4C4"));
        colorList.add(new HTMLColors(7, "Black", "000000"));
        colorList.add(new HTMLColors(8, "BlanchedAlmond", "FFEBCD"));
        colorList.add(new HTMLColors(9, "Blue", "0000FF"));
        colorList.add(new HTMLColors(10, "BlueViolet", "8A2BE2"));
        colorList.add(new HTMLColors(11, "Brown", "A52A2A"));
        colorList.add(new HTMLColors(12, "BurlyWood", "DEB887"));
        colorList.add(new HTMLColors(13, "CadetBlue", "5F9EA0"));
        colorList.add(new HTMLColors(14, "Chartreuse", "7FFF00"));
        colorList.add(new HTMLColors(15, "Chocolate", "D2691E"));
        colorList.add(new HTMLColors(16, "Coral", "FF7F50"));
        colorList.add(new HTMLColors(17, "CornflowerBlue", "6495ED"));
        colorList.add(new HTMLColors(18, "Cornsilk", "FFF8DC"));
        colorList.add(new HTMLColors(19, "Crimson", "DC143C"));
        colorList.add(new HTMLColors(20, "Cyan", "00FFFF"));
        colorList.add(new HTMLColors(21, "DarkBlue", "00008B"));
        colorList.add(new HTMLColors(22, "DarkCyan", "008B8B"));
        colorList.add(new HTMLColors(23, "DarkGoldenRod", "B8860B"));
        colorList.add(new HTMLColors(24, "DarkGray", "A9A9A9"));
        colorList.add(new HTMLColors(25, "DarkGreen", "006400"));
        colorList.add(new HTMLColors(26, "DarkKhaki", "BDB76B"));
        colorList.add(new HTMLColors(27, "DarkMagenta", "8B008B"));
        colorList.add(new HTMLColors(28, "DarkOliveGreen", "556B2F"));
        colorList.add(new HTMLColors(29, "DarkOrange", "FF8C00"));
        colorList.add(new HTMLColors(30, "DarkOrchid", "9932CC"));
        colorList.add(new HTMLColors(31, "DarkRed", "8B0000"));
        colorList.add(new HTMLColors(32, "DarkSalmon", "E9967A"));
        colorList.add(new HTMLColors(33, "DarkSeaGreen", "8FBC8F"));
        colorList.add(new HTMLColors(34, "DarkSlateBlue", "483D8B"));
        colorList.add(new HTMLColors(35, "DarkSlateGray", "2F4F4F"));
        colorList.add(new HTMLColors(36, "DarkTurquoise", "00CED1"));
        colorList.add(new HTMLColors(37, "DarkViolet", "9400D3"));
        colorList.add(new HTMLColors(38, "DeepPink", "FF1493"));
        colorList.add(new HTMLColors(39, "DeepSkyBlue", "00BFFF"));
        colorList.add(new HTMLColors(40, "DimGray", "696969"));
        colorList.add(new HTMLColors(41, "DodgerBlue", "1E90FF"));
        colorList.add(new HTMLColors(42, "FireBrick", "B22222"));
        colorList.add(new HTMLColors(43, "FloralWhite", "FFFAF0"));
        colorList.add(new HTMLColors(44, "ForestGreen", "228B22"));
        colorList.add(new HTMLColors(45, "Fuschia", "FF00FF"));
        colorList.add(new HTMLColors(46, "Gainsboro", "DCDCDC"));
        colorList.add(new HTMLColors(47, "GhostWhite", "F8F8FF"));
        colorList.add(new HTMLColors(48, "Gold", "FFD700"));
        colorList.add(new HTMLColors(49, "GoldenRod", "DAA520"));
        colorList.add(new HTMLColors(50, "Gray", "808080"));
        colorList.add(new HTMLColors(51, "Green", "008000"));
        colorList.add(new HTMLColors(52, "GreenYellow", "ADFF2F"));
        colorList.add(new HTMLColors(53, "HoneyDew", "F0FFF0"));
        colorList.add(new HTMLColors(54, "HotPink", "FF69B4"));
        colorList.add(new HTMLColors(55, "IndianRed", "CD5C5C"));
        colorList.add(new HTMLColors(56, "Indigo", "4B0082"));
        colorList.add(new HTMLColors(57, "Ivory", "FFFFF0"));
        colorList.add(new HTMLColors(58, "Khaki", "F0E68C"));
        colorList.add(new HTMLColors(59, "Lavender", "E6E6FA"));
        colorList.add(new HTMLColors(60, "LavenderBlush", "FFF0F5"));
        colorList.add(new HTMLColors(61, "LawnGreen", "7CFC00"));
        colorList.add(new HTMLColors(62, "LemonChiffon", "FFFACD"));
        colorList.add(new HTMLColors(63, "LightBlue", "ADD8E6"));
        colorList.add(new HTMLColors(64, "LightCoral", "F08080"));
        colorList.add(new HTMLColors(65, "LightCyan", "E0FFFF"));
        colorList.add(new HTMLColors(66, "LightGoldenRodYellow", "FAFAD2"));
        colorList.add(new HTMLColors(67, "LightGray", "D3D3D3"));
        colorList.add(new HTMLColors(68, "LightGreen", "90EE90"));
        colorList.add(new HTMLColors(69, "LightPink", "FFB6C1"));
        colorList.add(new HTMLColors(70, "LightSalmon", "FFA07A"));
        colorList.add(new HTMLColors(71, "LightSeaGreen", "20B2AA"));
        colorList.add(new HTMLColors(72, "LightSkyBlue", "87CEFA"));
        colorList.add(new HTMLColors(73, "LightSlateGray", "778899"));
        colorList.add(new HTMLColors(74, "LightSteelBlue", "B0C4DE"));
        colorList.add(new HTMLColors(75, "LightYellow", "FFFFE0"));
        colorList.add(new HTMLColors(76, "Lime", "00FF00"));
        colorList.add(new HTMLColors(77, "LimeGreen", "32CD32"));
        colorList.add(new HTMLColors(78, "Linen", "FAF0E6"));
        colorList.add(new HTMLColors(79, "Magenta", "FF00FF"));
        colorList.add(new HTMLColors(80, "Maroon", "800000"));
        colorList.add(new HTMLColors(81, "MediumAquaMarine", "66CDAA"));
        colorList.add(new HTMLColors(82, "MediumBlue", "0000CD"));
        colorList.add(new HTMLColors(83, "MediumOrchid", "BA55D3"));
        colorList.add(new HTMLColors(84, "MediumPurple", "9370DB"));
        colorList.add(new HTMLColors(85, "MediumSeaGreen", "3CB371"));
        colorList.add(new HTMLColors(86, "MediumSlateBlue", "7B68EE"));
        colorList.add(new HTMLColors(87, "MediumSpringGreen", "00FA9A"));
        colorList.add(new HTMLColors(88, "MediumTurquoise", "48D1CC"));
        colorList.add(new HTMLColors(89, "MediumVioletRed", "C71585"));
        colorList.add(new HTMLColors(90, "MidnightBlue", "191970"));
        colorList.add(new HTMLColors(91, "MintCream", "F5FFFA"));
        colorList.add(new HTMLColors(92, "MistyRose", "FFE4E1"));
        colorList.add(new HTMLColors(93, "Moccasin", "FFE4B5"));
        colorList.add(new HTMLColors(94, "NavajoWhite", "FFDEAD"));
        colorList.add(new HTMLColors(95, "Navy", "000080"));
        colorList.add(new HTMLColors(96, "OldLace", "FDF5E6"));
        colorList.add(new HTMLColors(97, "Olive", "808000"));
        colorList.add(new HTMLColors(98, "OliveDrab", "6B8E23"));
        colorList.add(new HTMLColors(99, "Orange", "FFA500"));
        colorList.add(new HTMLColors(100, "OrangeRed", "FF4500"));
        colorList.add(new HTMLColors(101, "Orchid", "DA70D6"));
        colorList.add(new HTMLColors(102, "PaleGoldenRod", "EEE8AA"));
        colorList.add(new HTMLColors(103, "PaleGreen", "98FB98"));
        colorList.add(new HTMLColors(104, "PaleTurquoise", "AFEEEE"));
        colorList.add(new HTMLColors(105, "PaleVioletRed", "DB7093"));
        colorList.add(new HTMLColors(106, "PapayaWhip", "FFEFD5"));
        colorList.add(new HTMLColors(107, "PeachPuff", "FFDAB9"));
        colorList.add(new HTMLColors(108, "Peru", "CD853F"));
        colorList.add(new HTMLColors(109, "Pink", "FFC0CB"));
        colorList.add(new HTMLColors(110, "Plum", "DDA0DD"));
        colorList.add(new HTMLColors(111, "PowderBlue", "B0E0E6"));
        colorList.add(new HTMLColors(112, "Purple", "800080"));
        colorList.add(new HTMLColors(113, "RebeccaPurple", "663399"));
        colorList.add(new HTMLColors(114, "Red", "FF0000"));
        colorList.add(new HTMLColors(115, "RosyBrown", "BC8F8F"));
        colorList.add(new HTMLColors(116, "RoyalBlue", "4169E1"));
        colorList.add(new HTMLColors(117, "SaddleBrown", "8B4513"));
        colorList.add(new HTMLColors(118, "Salmon", "FA8072"));
        colorList.add(new HTMLColors(119, "SandyBrown", "F4A460"));
        colorList.add(new HTMLColors(120, "SeaGreen", "2E8B57"));
        colorList.add(new HTMLColors(121, "SeaShell", "FFF5EE"));
        colorList.add(new HTMLColors(122, "Sienna", "A0522D"));
        colorList.add(new HTMLColors(123, "Silver", "C0C0C0"));
        colorList.add(new HTMLColors(124, "SkyBlue", "87CEEB"));
        colorList.add(new HTMLColors(125, "SlateBlue", "6A5ACD"));
        colorList.add(new HTMLColors(126, "SlateGray", "708090"));
        colorList.add(new HTMLColors(127, "Snow", "FFFAFA"));
        colorList.add(new HTMLColors(128, "SpringGreen", "00FF7F"));
        colorList.add(new HTMLColors(129, "SteelBlue", "4682B4"));
        colorList.add(new HTMLColors(130, "Tan", "D2B48C"));
        colorList.add(new HTMLColors(131, "Teal", "008080"));
        colorList.add(new HTMLColors(132, "Thistle", "D8BFD8"));
        colorList.add(new HTMLColors(133, "Tomato", "FF6347"));
        colorList.add(new HTMLColors(134, "Turquoise", "40E0D0"));
        colorList.add(new HTMLColors(135, "Violet", "EE82EE"));
        colorList.add(new HTMLColors(136, "Wheat", "F5DEB3"));
        colorList.add(new HTMLColors(137, "White", "FFFFFF"));
        colorList.add(new HTMLColors(138, "WhiteSmoke", "F5F5F5"));
        colorList.add(new HTMLColors(139, "Yellow", "FFFF00"));
        colorList.add(new HTMLColors(140, "YellowGreen", "9ACD32"));
    }

    public static void OutputColor(HTMLColors a)
    {
        System.out.println("Color: " + a.name + "\nHex Code: #" + a.hex + "\nRGB: " + HexToRGB(Long.parseLong(a.hex, 16)));
    }

    public static String HexToRGB(long hex) {
        long r = (hex & 0xFF0000) >> 16;
        long g = (hex & 0xFF00) >> 8;
        long b = (hex & 0xFF);
        return r + "," + g + "," + b;
    }

    public static String RGBToHex(String[] rgb)
    {
        return String.format("#%02X%02X%02X", Integer.parseInt(rgb[0]), Integer.parseInt(rgb[1]), Integer.parseInt(rgb[2]));
    }

    public static void RGBTriplet()
    {
        System.out.println("Enter your RGB Triplet in format 'red,green,blue'");

        HTMLColors fcol = null;

        String rgb = scan.nextLine();
        rgb = scan.nextLine(); // WTJ

        for (HTMLColors col : colorList)
        {
           if (rgb.equals(HexToRGB(Long.parseLong(col.hex, 16))))
           {
               fcol = col;
               break;
           }
        }

        if (fcol != null)
        {
            OutputColor(fcol);
        }
        else
        {
            System.out.println("Unknown color");
        }
    }

    public static void Hex()
    {
        System.out.println("Enter your Hex code in format '#hexcode'");

        HTMLColors fcol = null;

        String hex = scan.nextLine();
        hex = scan.nextLine(); // WTJ

        for (HTMLColors col : colorList)
        {
            if (col.hex.toLowerCase().equals(hex.replace("#", "").toLowerCase()))
            {
                fcol = col;
                break;
            }
        }

        if (fcol != null)
        {
           OutputColor(fcol);
        }
        else
        {
            System.out.println("Unknown color");
        }
    }

    public static void Name()
    {
        System.out.println("Enter a color name");

        HTMLColors fcol = null;
        String name = scan.nextLine();
        name = scan.nextLine(); // WTJ

        for (HTMLColors col : colorList)
        {
            if (col.name.toLowerCase().equals(name.toLowerCase()))
            {
                fcol = col;
                break;
            }
        }

        if (fcol != null)
        {
            OutputColor(fcol);
        }
        else
        {
            System.out.println("Unknown color");
        }
    }

    public static void main(String[] args) {
        LoadColors();
        System.out.println("Which format are you entering?\n1. RGB Triplet (255,255,255)\n2. Hex code (#FFFFFF)\n3. Color name (red)");
        int in = scan.nextInt();
        switch (in)
        {
            case 1:
                RGBTriplet();
                break;
            case 2:
                Hex();
                break;
            case 3:
                Name();
                break;
        }
    }
}
