package com.company;

public class Main {

    public static void main(String[] args) {



        //Mike is a painter who wants to make his job easier by using this application.
        //It is avery simple application designed to calculate how many buckets of paint Mike
        //need to do his job.
        //The first method calculating how many buckets he needs if he got some extra buckets at home.
        //The second method will tell how many to buy in the store.
        //And the third method gives a total count if only the area and the area per bucket parameters are known.




        System.out.println("Mike needs " + getBucketCount(4.7,2.5,1.5,1)
                            + " buckets to do the job");
        System.out.println("Mike need to buy " + getBucketCount(5.4,2.7,1.5)
                           + " buckets altogether ");
        System.out.println("Mike need a total of " + getBucketCount(8.44,2.2)
                           + " buckets");







    }
    public static int getBucketCount(double width,double height,double areaPerBucket,double extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0 ){
            return -1; // to indicate an invalid value
        }
        return (int) Math.ceil(((width * height) /(areaPerBucket)) - (extraBuckets)); // casting to int
    }                                                                                 // to get whole number

    public static int getBucketCount(double width,double height,double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 ){
            return -1; // to indicate an invalid value
        }
        return (int) Math.ceil((width * height) /(areaPerBucket)); // casting to int
                                                                 // to get whole number
    }
    public static int getBucketCount(double area,double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0){
            return -1; // to indicate an invalid value
        }
        return (int) Math.ceil(area / areaPerBucket);
    }




}

