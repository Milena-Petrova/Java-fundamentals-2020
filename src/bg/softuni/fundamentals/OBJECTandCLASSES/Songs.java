package bg.softuni.fundamentals.OBJECTandCLASSES;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Define a class Song, which holds the following information about songs: Type List, Name and Time.
On the first line you will receive the number of songs - N.
On the next N-lines you will be receiving data in the following format: "{typeList}_{name}_{time}".
On the last line you will receive "Type List" / "all". Print only the Names of the songs which are from that Type List /
*/
public class Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<SongsPlayList>songs = new ArrayList<>();
        for (int i = 0; i <numberOfSongs ; i++) {
            String input =scanner.nextLine();
            String[]playListLine = input.split("_");
            String type = playListLine[0];
            String name = playListLine[1];
            String time = playListLine[2];
            SongsPlayList song = new SongsPlayList(type,name,time);
            songs.add(song);
        }
        String command = scanner.nextLine();
        if(command.equals("all")){
            for (SongsPlayList song : songs) {
                System.out.println(song.getName());
            }
        }else{
            for (SongsPlayList song : songs) {
                if(song.getTypeList().equals(command)){
                    System.out.println(song.getName());
                }
            }

        }
    }

    static class SongsPlayList{
        String typeList;
        String name;
        String time;

        public SongsPlayList(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
