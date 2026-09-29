class MyHashMap {

    public class Node{
        int key;
        int value;
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }

    ArrayList<LinkedList<Node>> buckets;
    int BUCKET_SIZE = 20000;
    public MyHashMap() {
       this.buckets = new ArrayList<LinkedList<Node>>();
       for(int i = 0 ;i < BUCKET_SIZE ; i++){
            this.buckets.add(new LinkedList<Node>());
       }
    }
    
    public void put(int key, int value) {
        LinkedList<Node> bucket = buckets.get(hash(key));
        for(int i = 0 ; i < bucket.size() ; i++){
            if(bucket.get(i).key == key){
                bucket.get(i).value = value;
                return ;
            }
        }
        bucket.add(new Node(key,value));
    }
    
    public int get(int key) {
        LinkedList<Node> bucket = buckets.get(hash(key));
        for(int i = 0 ; i < bucket.size() ; i++){
            if(bucket.get(i).key == key){
                return bucket.get(i).value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        LinkedList<Node> bucket = buckets.get(hash(key));
        for(int i = 0 ; i < bucket.size() ; i++){
            if(bucket.get(i).key == key){
                bucket.remove(bucket.get(i));
                return ;
            }
        }     
    }

    public int hash(int key){
        return key % BUCKET_SIZE;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */