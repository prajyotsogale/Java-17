public class Think {

    public static void main(String[] args) {
//        System.out.println(placeTiles(3,2));
        System.out.println(callGuest(4));
    }

    public static int placeTiles(int n, int m){

        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //vertically
        int vertPlacements = placeTiles(n-m,m);

        //horizontally

        int horPlacements = placeTiles(n-1,m);

        return vertPlacements+horPlacements;
    }

    public static int callGuest(int n){

        if(n<=1){
            return 1;
        }

        //single
        int way1 = callGuest(n-1);
        //pair
        int way2 = (n-1)*callGuest(n-2);

        return way1+way2;
    }
}
