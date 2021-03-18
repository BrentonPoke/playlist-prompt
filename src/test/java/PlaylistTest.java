import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	LinkedList<String> list;
	Playlist playlist;
	@BeforeEach
	void setUp() {
		playlist = new Playlist();
		list = new LinkedList<>();
		list.add("Runaway - Blue Wednesday");
		list.add("After Dark - Sugi.Wa");
		list.add("Traveling - Anbuu");
		list.add("Code - Aarigod");
		list.add("Hereafter - Makzo");
	}
	
	@Test
	void add() {
		LinkedList<String> newList = new LinkedList<String>();
		newList.add("Peninsula - Psalm Trees");
		newList.add("Toofpick - Blue Wednesday");
		newList.add("Bloom - Aviino");
		LinkedList<String> finalList = playlist.add(list,newList, 2);
		assertEquals(finalList.get(2), "Peninsula - Psalm Trees");
		assertEquals(finalList.get(3),"Toofpick - Blue Wednesday");
		assertEquals(finalList.get(4),"Bloom - Aviino");
	}

  @Test
  void remove() {
	  LinkedList<String> newList = new LinkedList<>();
	  newList.add("Code - Aarigod");
	  newList.add("After Dark - Sugi.Wa");
	  LinkedList<String> finalList = playlist.remove(list,newList);
		assertFalse(finalList.contains("Code - Aarigod"));
		assertFalse(finalList.contains("After Dark - Sugi.Wa"));
  }

  @Test
  void removeNumberOfTracksFromTop() {
	  LinkedList<String> finalList =	playlist.removeNumberOfTracksFromTop(list,3);
		
		assertFalse(finalList.contains("Traveling - Anbuu"));
	  assertFalse(finalList.contains("After Dark - Sugi.Wa"));
	  assertFalse(finalList.contains("Runaway - Blue Wednesday"));
  }

  @Test
  void moveTracks() {
	  LinkedList<String> newList = new LinkedList<>();
	  newList.add("Code - Aarigod");
	  newList.add("After Dark - Sugi.Wa");
	  
	  LinkedList<String> finalList =	playlist.moveTracks(list,newList,2);
	  assertEquals(finalList.get(2), "Code - Aarigod");
	  
	  newList.add("Runaway - Blue Wednesday");
	  newList.add("Traveling - Anbuu");
	  finalList = playlist.moveTracks(list,newList,3);
	  assertEquals(finalList.get(3),"Runaway - Blue Wednesday");
	  
	  newList.add("After Dark - Sugi.Wa");
	  finalList = playlist.moveTracks(list,newList,3);
	  assertEquals(finalList.get(3),"After Dark - Sugi.Wa");
  }
}