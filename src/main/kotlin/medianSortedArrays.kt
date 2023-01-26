fun main(){
    val medianSortedArrays = MedianSortedArrays()
    println(medianSortedArrays.findMedianSortedArrays(intArrayOf(1,3), intArrayOf(2)))
    println(medianSortedArrays.findMedianSortedArrays(intArrayOf(1,2), intArrayOf(3,4)))
    print( medianSortedArrays.findMedianSortedArrays(intArrayOf(), intArrayOf(1)))

}

class MedianSortedArrays {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray):Double {
        val nums = nums1 + nums2
        nums.sort()
        val size = nums.size
        if(size%2 == 0){
            val arg = size/2-1
            val arg2 = arg+1
            val answer:Double = (nums[arg].toDouble()+nums[arg2].toDouble())/2.0
            return answer
        }else{
            val arg = size/2
            return nums[arg].toDouble()
        }
    }
}