package com.tanky.hot100.substring;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // TODO：按窗口从左到右的顺序返回每个窗口的最大值。
        //throw new UnsupportedOperationException("待独立实现：239. 滑动窗口最大值");
        int n=nums.length;
        int [] ans=new int[n-k]
        int maxK=Integer.MIN_VALUE;
        for(int i=1;i<k;i++ ){
           maxK=Math.max(nums[i],maxK);
        }
        
       Deque<Integer> deque = new ArrayDeque<>();
       deque.offer(maxK);
       
       for(int i=k;i++;i<n){
       
         
         ans[i-k]=deque.poll();
       
       
       }
         
    }
}
