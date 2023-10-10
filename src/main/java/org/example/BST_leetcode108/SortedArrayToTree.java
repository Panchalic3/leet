package org.example.BST_leetcode108;

public class SortedArrayToTree {
    public TreeNode sortedArrayToBST(int[] nums) {
            if (nums.length == 0 )return null;
            return createNode(nums,0,nums.length-1);

        }
        public TreeNode createNode(int[] nums, int start, int end){
            if(start>end) return null;
            int mid = start + (end-start)/2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = createNode(nums, start, mid-1);
            node.right = createNode(nums, mid+1, end);
            return node;




        }

    public static void main(String[] args) {
        SortedArrayToTree sortedArrayToTree = new SortedArrayToTree();
        int arr [] = {-2,3,5,7,8,11,16,18};
        System.out.println("here");
        System.out.println(sortedArrayToTree.sortedArrayToBST(arr).val);
        System.out.println(sortedArrayToTree.sortedArrayToBST(arr).left.val);
        System.out.println(sortedArrayToTree.sortedArrayToBST(arr).right.val);
        System.out.println("there");

    }

    }


