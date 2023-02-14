import java.util.*;

public class P1{
	public static void main(String[] args){

		Scanner scanner=new Scanner(System.in);
        
        int[][] array_old=new int[4][5];
        for (int i=0; i<4; i++){
            for (int c=0; c<5; c++){
                array_old[i][c]=0;
            }
        }
        
        
        
        int[][] array={{1,2,2,2,3,4,5,5},{5,5,5,5},{5,5,9}};
        //int[][] array={{1,2,2,2,3,4,5,5},{6,7,8,8,8,9}};
		int[][] result=removeDuplicates(array);
        
        for (int y=0; y<result.length; y++){
            for (int x=0; x<result[y].length; x++){
                System.out.print(result[y][x]+" ");
            }
            System.out.println();
        }
        /*
		int input=scanner.nextInt();
		System.out.println(mirrorNum(input));
		System.out.println(expValue(2, 1));
         */
	}
	public static int stringValue(String word){
		int highest_value=0;
		int overall_sum=0;
		int num_sum=0;
		int prev_value=-1;

		for (int i=0; i<word.length(); i++){
			if ( (int) word.charAt(i)>=48&& (int) word.charAt(i)<=57){
				num_sum+=(int)word.charAt(i);
			}else{
				if ( (int) word.charAt(i)!=prev_value){
					if ( (int) word.charAt(i)>highest_value){
						highest_value=(int) word.charAt(i);	
					}
					if ( (int) word.charAt(i)!=32){
						overall_sum+=(int) word.charAt(i);
					}
					prev_value=(int) word.charAt(i);
				}else{
					prev_value=-1;
				}
			}

		}
		overall_sum+=highest_value*num_sum;

		return overall_sum;
	}

	public static double expValue(int x, double precision){
		double tmp_sum=0, overall_sum=1;
		int exponent=1;
		long multiplied=1;
		while (true){
			multiplied=1;
			for (int i=1; i<=exponent; i++){
				multiplied*=i;
			}

			tmp_sum=Math.pow(x, exponent)/(multiplied);
			if (tmp_sum<precision){
				break;
			}else{
				overall_sum+=tmp_sum;
			}
			exponent++;
		}
		return overall_sum;
	}

	public static int mirrorNum(int num){
		int num_length=get_length(num);
		int divider=1;
		int mirror_num=0, tmp_sum=0;
		int multiplier=1;
		
		boolean is_negative=false;
		for (int i=0; i<num_length-1; i++){
			divider*=10;
		}
		
		
		if (num<0){
			num*=-1;
			is_negative=true;
		}

		System.out.println(num);
			
		System.out.println(num_length);
		for (int i=0; i<num_length; i++){
			tmp_sum=num/divider;
			mirror_num+=tmp_sum*multiplier;	
			
			num-=tmp_sum*divider;
			divider/=10;

			if (!(i+1==num_length)){
				multiplier*=10;
			}
		}

		if (is_negative){
			mirror_num*=-1;
		}

		return mirror_num;
	}
    
    public static int[][] removeDuplicates(int[][] array){
        boolean is_present=false;
        int largest_size=0;
        int rows_size=0;
        
        for (int i=0; i<array.length; i++){
            if (array[i].length>largest_size){
                largest_size=array[i].length;
            }
        }
        
        int[][] array_new=new int[array.length][largest_size];
        int[][] arranged_array=new int[array.length][];
        
        for (int y=0; y<array.length; y++){
            int tmp_array[]=new int[array.length]; 
            for (int x=0; x<(array[y].length); x++){
                if (!array_contains(array_new, array[y][x])){
                    array_new[y][x]=array[y][x];
                    tmp_array[rows_size]=array[y][x];
                    rows_size++;
                }
            }
            
            arranged_array[y]=new int[rows_size];
            
            for (int i=0; i<rows_size; i++){
                arranged_array[y][rows_size]=tmp_array[rows_size];
            }
            
            rows_size=0;
            
        }
        
        
        
        

	return arranged_array;
        
    }
    
    public static boolean array_contains(int[][] array, int input){
        
        boolean is_present=false;
        
        for (int y=0; y<array.length; y++){
            for (int x=0; x<array[y].length; x++){
                if (array[y][x]==input){
                    is_present=true;
                    return is_present;
                }
            }
        }
        
        return is_present;
    }

	public static int get_length(int input){
		int tmp=1;
		int digits=0;
		
		if (input<0){
			input*=-1;
		}
		while (tmp<=input){
			digits++;
			tmp*=10;
		}

		return digits;

	}
}
