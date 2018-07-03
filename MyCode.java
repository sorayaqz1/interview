import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.HashSet;

class MyCode {

  List<HashSet<String>> friendsSetList = new ArrayList<HashSet<String>>();

  public static void main (String[] args) {
    System.out.println("Hello Java");
    MyCode myCode = new MyCode();
    myCode.buildFriendsList();
    myCode.printFriendsList();

    System.out.println(myCode.isFriend("Anna", "Minnie"));
    System.out.println(myCode.isFriend("Tom", "Micky"));
    System.out.println(myCode.isFriend("Tom", "Jerry"));
    System.out.println(myCode.isFriend("Tom", "Minnie"));
    System.out.println(myCode.isFriend("Jerry", "Minnie"));
    System.out.println(myCode.isFriend("Tom", "Anna"));

  }

  // shicheng@visa.com
  public List<String[]> getInput() {
      List<String[]> list = new ArrayList<>();

      list.add(new String[]{"Tom", "Jerry"});
      list.add(new String[]{"Micky", "Jerry"});
      list.add(new String[]{"Micky", "Minnie"});
      list.add(new String[]{"Anna", "Elsa"});

      return list;
  }

 public void buildFriendsList() {
   for (String[] pair : getInput()) {
     String f1 = pair[0];
     String f2 = pair[1];
     boolean hasSet = false;
     for (int i=0; i<friendsSetList.size(); i++) {
       HashSet<String> fset = friendsSetList.get(i);
       if (fset.contains(f1) && fset.contains(f2)) {
         hasSet = true;
         break;
       }
       if (fset.contains(f1)) {
         fset.add(f2);  hasSet = true; break;
       }
       if (fset.contains(f2)) {
         fset.add(f1); hasSet = true; break;
       }
     }
     if (!hasSet) {
       HashSet<String> newSet = new HashSet<String>();
       newSet.add(f1);
       newSet.add(f2);
       friendsSetList.add(newSet);
     }
   }
 }

 public void printFriendsList() {
   for (HashSet<String> fset : friendsSetList) {
     System.out.println(fset);
   }
 }

  public boolean isFriend(String name1, String name2) {
    for (int i=0; i<friendsSetList.size(); i++) {
      HashSet<String> fset = friendsSetList.get(i);
      if (fset.contains(name1) && fset.contains(name2)) {
        return true;
      }
    }

    return false;
  }





}
