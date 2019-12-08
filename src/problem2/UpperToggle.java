package problem2;

public class UpperToggle {
    public String newtext;

    public void toggle(String text) {
        System.out.println();
        System.out.println("Problem 2");
        for (int i = 0; i < text.length(); i++) {
            newtext = "";
            boolean t = false;
            for (int j = 0; j < text.length(); j++) {
                if (j == i) {
                    newtext = newtext.concat(String.valueOf(text.charAt(j)).toUpperCase());
                } else if (String.valueOf(text.charAt(i)).equals(" ")) {
                    t = true;
                    break;
                } else
                    newtext = newtext.concat(String.valueOf(text.charAt(j)));
            }
            if (!t)
                System.out.println(newtext);
        }


    }

}
