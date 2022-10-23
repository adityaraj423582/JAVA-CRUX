package Array;

public class solution_array {
private int [] items;
private int count;



        public void Array(int length){
            items =new int[length];

        }
public void insert(int item){
            if(items.length == count){

                int [] newItems = new int[count*2];

                for(int i=0;i<count;i++){
                    newItems[i] = items[i];
                }
                items = newItems;



            }






        }




    }



