package languageconstructs;

public class Task8 {

	public static StringBuilder removeString(String base, String remove) {
		StringBuilder baseLowcase = new StringBuilder(base.toLowerCase());
		StringBuilder baseTemp = new StringBuilder(base);
		String removeLowcase = remove.toLowerCase();
		int removeLength = remove.length();
		int removeIndex = baseLowcase.indexOf(removeLowcase);
		while(removeIndex != -1){
			baseLowcase = baseLowcase.delete(removeIndex,removeIndex + removeLength);
			baseTemp = baseTemp.delete(removeIndex,removeIndex + removeLength);
			removeIndex = baseLowcase.indexOf(removeLowcase);
		}
		return baseTemp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String base = "HappyhappY",remove="appy";
		System.out.println(removeString(base,remove));
	}

}
