import java.util.LinkedList;

public class Playlist {

	public LinkedList<String> add(LinkedList<String> list, LinkedList<String> listToAdd, int index){
		
		while(!listToAdd.isEmpty()){
			list.add(index,listToAdd.getFirst());
			listToAdd.removeFirst();
			index++;
		}
		return list;
	}
	
	public LinkedList<String> remove(LinkedList<String> list, LinkedList<String> listToRemove){
		list.removeAll(listToRemove);
		return list;
	}
	
	public LinkedList<String> removeNumberOfTracksFromTop(LinkedList<String> list, int number){
		for(int i = 0; i < number; i++)
		list.removeFirst();
		return list;
	}
	
	public LinkedList<String> moveTracks(LinkedList<String> list, LinkedList<String> listToMove, int index){
		if(list.containsAll(listToMove)){
		list.removeAll(listToMove);
		add(list,listToMove,index);
		}
    System.out.println(list);
		return list;
	}

}
