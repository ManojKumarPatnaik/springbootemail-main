package com.springlearning.random;

import com.springlearning.services.Sorting;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;

public class Dummy {



//        private static final Logger LOGGER = LoggerFactory.getLogger(DateAndTimeUtility.class);
        private static final String ERROR_MESSAGE = "DateAndTimeUtils thrown error while parsing date :: ";



        //    private static SimpleDateFormat getSimpleDateFormat() {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(EcsConstants.TIME_ZONE));
//        return simpleDateFormat;
//    }
        private static ThreadLocal<SimpleDateFormat> simpleDateFormatThreadLocal= ThreadLocal
                .withInitial(()->{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss" );
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/Toronto"));
            return simpleDateFormat;
        });

        private static ThreadLocal<SimpleDateFormat> simpleDateFormatThreadLocalAndTimeStamp= ThreadLocal
                .withInitial(()->{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/Toronto"));
            return simpleDateFormat;
        });
//    private static SimpleDateFormat getSimpleDateFormatWithTimeZoneAndTimeStamp() {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(EcsConstants.TIME_ZONE));
//        return simpleDateFormat;
//    }



        public static Date getCurrentDateWithTimeStamp() {

            Date date =null;
            try {
                date = simpleDateFormatThreadLocalAndTimeStamp.get().parse(getCurrentDateInStringWithTimeStamp());
            } catch (ParseException e) {
//                log.error("Date and time utils has thrown an error {0}",e);
            }
            return date;
        }

        /**
         * This method will return yyyy-MM-dd formatted String date.
         * @return date
         */
        public static String getCurrentDateInString(){
            return simpleDateFormatThreadLocal.get().format(Date.from(Instant.now()));
        }

        public static String getCurrentDateInStringWithTimeStamp(){
            return simpleDateFormatThreadLocalAndTimeStamp.get().format(Date.from(Instant.now()));
        }

        /**
         * It will take input as Date and convert into yyyy-MM-dd formatted String date
         * @param date in Date format.
         * @return date
         */
        public static String getStringDateFromDate(Date date){
            return simpleDateFormatThreadLocal.get().format(date);
        }

        /**
         * It will take input as year and month convert into date format with 31st of month.
         * @param year in integer
         * @param month in integer
         * @return date
         */
        public static Date getDateFromYearAndMonth(Number year, Number month) {
            String str = year+"-"+month +"-"+ "31";
            Date date = null;
            try {
                date = simpleDateFormatThreadLocal.get().parse(str);
            } catch (ParseException e) {
//                LOGGER.error(ERROR_MESSAGE, e);
            }
            return date;
        }

        /**
         * It will take input as year and month return yyyy-MM-dd formatted String date with 1st of the month.
         * @param year in integer
         * @param month in integer
         * @return date
         */
        public static String getFirstDayOfTheMonthInYYYYMMDDFormat(Number year, Number month) {
            return year + "-" + String.format("%02d", month.intValue()) + "-" + "01";
        }

        /**
         * It will take input date in long format and return yyy-MM-dd formatted String date.
         * @param date in long
         * @return date
         */
        public static String getDateFromLongDate(long date) {
            return simpleDateFormatThreadLocal.get().format(date);
        }

        /**
         * It will take input as year and month return yyyy-MM-dd formatted String date with last date of the month.
         * @param year in integer
         * @param month in integer
         * @return date
         */
        public static String getLastDayOfTheMonthInYYYYMMDDFormat(Number year, Number month){
            return year + "-" + String.format("%02d", month.intValue()) + "-" +
                    YearMonth.of(year.intValue(), month.intValue()).lengthOfMonth();
        }

        /**
         * It will take input as string date in yyyy-mm-dd format and convert into date.
         * @param date yyyy-MM-dd format
         * @return date
         */
        public static Date getDate(String date) {
            Date parsedDate = null;
            try {
                parsedDate = simpleDateFormatThreadLocal.get().parse(date);
            } catch (ParseException e) {
//                LOGGER.error(ERROR_MESSAGE, e);
            }
            return parsedDate;
        }

        /**
         * It will take input as string date in yyyyMMdd format and convert into date.
         * @param date in yyyyMMdd format
         * @return date
         */
        public static Date getDateFromYYYYMMDDFormatWithOutDelimiter(String date){
            SimpleDateFormat simpleDateFormatOld = new SimpleDateFormat("yyyyMMdd");
            simpleDateFormatOld.setTimeZone(TimeZone.getTimeZone("America/Toronto"));
            Date parsedDate = null;
            try {
                parsedDate = simpleDateFormatOld.parse(date);
            } catch (ParseException e) {
//                LOGGER.error(ERROR_MESSAGE, e);
            }
            return parsedDate;
        }

        public static long getCreatedOnDateIgnoringTime(String createdOn){
            Date createdOnDate = getDate(
                    getStringDateFromDate(getDateFromCreatedOn(createdOn)));
            if(createdOnDate != null){
                return createdOnDate.getTime();
            }
            return 0L;
        }

        /**
         * It will take input as string date in "yyyy-MM-dd'T'hh:mm:ss.SSS'Z'" or "yyyy-MM-dd hh:mm:ss" format
         * and convert into date.
         * @param createdOn as String
         * @return date
         */
        public static Date getDateFromCreatedOn(String createdOn) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS'Z'");
            Date parsedDate = null;
            try {
                parsedDate = formatter.parse(createdOn);
            } catch (ParseException e) {
                formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                try {
                    parsedDate = formatter.parse(createdOn);
                } catch (ParseException ex) {
//                    LOGGER.error(ERROR_MESSAGE, ex);
                }
            }
            return parsedDate;
        }
        private static SimpleDateFormat getSimpleDateFormatWithTimeZoneAndTimeStampZ() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS'Z'");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/Toronto"));
            return simpleDateFormat;
        }
        public static String getCurrentDateInStringWithTimeStampZ(){
            return getSimpleDateFormatWithTimeZoneAndTimeStampZ().format(Date.from(Instant.now()));
        }

        /**
         * It will take input as string date in "yyyy-MM-dd' format and will return LocalDate object.
         * @param inputDate as String
         * @return date as LocalDate
         */
        public static LocalDate getLocalDateFromString(String inputDate){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            return LocalDate.parse(inputDate , formatter);
        }


        public static int binary(int n){
            var v=new HashMap<String,Integer>();
            Integer integer = v.put("1", 2);
            System.out.println(integer);
            Integer integer1 = v.put("1", 4);
            System.out.println(integer1);
            int b[]=new int[40];
            int i=0;
            while(n>0){
//                b[i++]=n%
            }return -1;
        }

    public static Date getCurrentDate() {
        Date date =null;
        try {
            date = simpleDateFormatThreadLocal.get().parse(getCurrentDateInString());
//            log.info("Current Date is : "+date);
        } catch (ParseException e) {
//            log.error("Date and time utils has thrown an error {0}",e);
        }
        return date;
    }


    public static void main(String[] args) {

        int[] A ={1,2,3,4,5};
        int[] copyOf = Arrays.copyOf(A, 10);
        System.out.println(Arrays.toString(copyOf));
        int[] c =new int[10];
        System.arraycopy(A,0,c,0,A.length);
        System.arraycopy(A,0,c,A.length,A.length);
        System.out.println(Arrays.toString(c));

//        System.out.println(binary(2));
//        int[][] im ={{1,1,0},{0,1,0},{0,1,0}};
//        int[][] a2 ={{0,0,0},{0,1,1},{0,0,1}};
//        System.out.println(new Dummy().largestOverlap(im,a2));
//        System.out.println("Hello World!");
//        System.out.println(bsr(new int[]{1,3,3,6,7},6,0, 4));
//        pattern(5);
//        System.out.println();
//        Vector<Integer> vector=new Vector<>();
//        vector.add(1);
//        vector.add(2);
//        Enumeration<Integer> elements = vector.elements();
//
//        for (Integer integer : vector) {
//            System.out.println(integer);
//        }





        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/Toronto"));
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        simpleDateFormat1.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println(simpleDateFormat.format(new Date()));
        System.out.println("dnnd: "+simpleDateFormat1.format(new Date()));
        String yesterdaysDate = getDateFromLongDate(
                getCurrentDate().getTime() - 86_400_000);
        System.out.println(yesterdaysDate);





//        int[] ints = {-1, -2, -3,  4, 5};
////        bubbleSorting(ints);
//        cycleSort(ints);
//        System.out.println(Arrays.toString(ints));
    }

    public static void insertionSorting(int A[]){
        for (int i = 0; i < A.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                if(A[j]<A[j-1]){
                    int temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }else break;
            }
        }
    }

    public static void selectionSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int ind=i;
            for (int j = i+1; j < array.length; j++) {
                if(array[ind] > array[j]){
                    ind = j;
                }
            }
            if(ind!=i) {
                int temp = array[ind];
                array[ind] = array[i];
                array[i] = temp;
            }
        }
    }
    public static void bubbleSorting(int A[]) {
        boolean flag = false;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length-i-1; j++) {
                if(A[j] >A[j+1]) {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    flag=true;
                }
            }
            if(!flag) break;
        }
    }

    class Pair<T,V>{
        private T key;
        private V value;

        public T getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        Pair(T t, V v){
            this.key =t;
            this.value =v;
        }
    }
    protected List<Pair<Integer, Integer>> non_zero_cells(int[][] M) {
        List<Pair<Integer, Integer>> ret = new ArrayList<>();
        for (int row = 0; row < M.length; ++row)
            for (int col = 0; col < M.length; ++col)
                if (M[row][col] == 1) ret.add(new Pair<>(row, col));
        return ret;
    }

    public int largestOverlap(int[][] A, int[][] B) {

        List<Pair<Integer, Integer>> A_ones = non_zero_cells(A);
        List<Pair<Integer, Integer>> B_ones = non_zero_cells(B);
        int maxOverlaps = 0;
        HashMap<Pair<Integer, Integer>, Integer> groupCount = new HashMap<>();
        for (Pair<Integer, Integer> a : A_ones)
            for (Pair<Integer, Integer> b : B_ones) {
                Pair<Integer, Integer> vec =
                        new Pair<>(b.getKey() - a.getKey(), b.getValue() - a.getValue());
                groupCount.put(vec, groupCount.getOrDefault(vec,0) + 1);
                maxOverlaps = Math.max(maxOverlaps, groupCount.get(vec));
            }
        return maxOverlaps;
    }

    public static int bsr(int A[],int t,int s,int e){
        if(s>e) return -1;
        int m=s+(e-s)/2;
        if (t==A[m]) return m;
        else if (t>A[m]) return bsr(A,t,m+1,e);
        return bsr(A,t,s,m-1);
    }
    public static void pattern(int n) {
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n; j++) {
                int temp = n-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }

    public static void cycleSort(int A[]){
        int s=0;
        while(s<A.length){
            int c=A[s]-1;
            if(A[s]!=A[c]){
                int temp=A[s];
                A[s]=A[c];
                A[c]=temp;
            }
            else s++;
        }
    }

}
