package tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.gradescope.jh61b.grader.GradedTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import assignment.QuickSort;
import assignment.MyStackTrace;

public class QuickSortTest {

    static int[] inputArray; // Array elements for QuickSort operation
	
	// Helper functions
	static void prepareInputDataFromText(String filename) throws FileNotFoundException, IOException{
			
		File file = new File(filename);
        Scanner sc = new Scanner(file);
        
        String input = sc.nextLine();
        String[] strs = input.trim().split("\\s+");
        inputArray = new int[strs.length];
        StringArrToIntArr(inputArray, strs, 0);
        
        sc.close();
    }
	
	// Helper functions
	public static void StringArrToIntArr(int[] arr, String[] s, int startingindex) {
		
		//startingindex is the index from where we are populating the array from input file
		for (int i = 0, j = startingindex; i < s.length; i++, j++) {
			arr[j] = Integer.parseInt(s[i]);
	    }
	}

    /* A utility function to print array of size n */
    static String printArray(int arr[])
    {
        String result = "";
    	for (int i = 0; i < arr.length; i++)
            result = result + arr[i] + " ";
        
    	return result.trim();
    }

    @Test
    @GradedTest(name="Test 1 (Partition operation 1)", max_score=2)
    public void testPartitionOperation1() throws FileNotFoundException, IOException {

        String fileName = "./tests/qs1.txt";
		prepareInputDataFromText(fileName);
		
		QuickSort qs = new QuickSort();
        int[] clonnedArrForPartitionCheck = inputArray.clone();
		int pivotPosition = qs.inPlacePartition(clonnedArrForPartitionCheck, 0, clonnedArrForPartitionCheck.length - 1);
		//System.out.println(pivotPosition);
		String firstPartitionOperationOutput = printArray(clonnedArrForPartitionCheck);

        assertEquals("18 54 5 27 24 40 16 36 24 61 935 941 670 637 811 263 538 584 310 720 351 922 361 762 915 615 481 322 249 227 522 453 720 267 297 594 69 605 236 162 582 746 135 928 975 549 365 375 225 462 303 335 431 272 602 692 996 605 569 724 238 114 635 871 385 808 699 474 334 970 530 779 68 813 83 895 940 309 211 832 154 568 77 194 284 520 871 62 392 285 898 235 696 946 215 89 737 896 545 267", firstPartitionOperationOutput);
        
    }

    @Test
    @GradedTest(name="Test 2 (QuickSort Operation 1)", max_score=2)
    public void testQuickSortOperation1() throws FileNotFoundException, IOException {

        String fileName = "./tests/qs1.txt";
		prepareInputDataFromText(fileName);
		
		QuickSort qs = new QuickSort();
		String generatedOutput = qs.quickSortOperation(inputArray);

        if(MyStackTrace.recursiveRunCount < 20){
            generatedOutput = "You need to use recursive procedure";
        }

        
        assertEquals("5 16 18 24 24 27 36 40 54 61 62 68 69 77 83 89 114 135 154 162 194 211 215 225 227 235 236 238 249 263 267 267 272 284 285 297 303 309 310 322 334 335 351 361 365 375 385 392 431 453 462 474 481 520 522 530 538 545 549 568 569 582 584 594 602 605 605 615 635 637 670 692 696 699 720 720 724 737 746 762 779 808 811 813 832 871 871 895 896 898 915 922 928 935 940 941 946 970 975 996", generatedOutput);

    }

    @Test
    @GradedTest(name="Test 3 (Partition operation 2)", max_score=2)
    public void testPartitionOperation2() throws FileNotFoundException, IOException {

        String fileName = "./tests/qs2.txt";
		prepareInputDataFromText(fileName);
		
		QuickSort qs = new QuickSort();
        int[] clonnedArrForPartitionCheck = inputArray.clone();
		int pivotPosition = qs.inPlacePartition(clonnedArrForPartitionCheck, 0, clonnedArrForPartitionCheck.length - 1);
		//System.out.println(pivotPosition);
		String firstPartitionOperationOutput = printArray(clonnedArrForPartitionCheck);


        assertEquals("2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2", firstPartitionOperationOutput);
        
    }

    @Test
    @GradedTest(name="Test 4 (QuickSort Operation 2)", max_score=2)
    public void testQuickSortOperation2() throws FileNotFoundException, IOException {

        String fileName = "./tests/qs2.txt";
		prepareInputDataFromText(fileName);
		
		QuickSort qs = new QuickSort();
		String generatedOutput = qs.quickSortOperation(inputArray);

        if(MyStackTrace.recursiveRunCount < 20){
            generatedOutput = "You need to use recursive procedure";
        }

        
        assertEquals("2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2", generatedOutput);

    }

    @Test
    @GradedTest(name="Test 5 (Partition operation 3)", max_score=2)
    public void testPartitionOperation3() throws FileNotFoundException, IOException {

        String fileName = "./tests/qs3.txt";
		prepareInputDataFromText(fileName);
		
		QuickSort qs = new QuickSort();
        int[] clonnedArrForPartitionCheck = inputArray.clone();
		int pivotPosition = qs.inPlacePartition(clonnedArrForPartitionCheck, 0, clonnedArrForPartitionCheck.length - 1);
		//System.out.println(pivotPosition);
		String firstPartitionOperationOutput = printArray(clonnedArrForPartitionCheck);

        assertEquals("5 16 18 24 24 27 36 40 54 61 62 68 69 77 83 89 114 135 154 162 194 211 215 225 227 235 236 238 249 263 267 267 272 284 285 297 303 309 310 322 334 335 351 361 365 375 385 392 431 453 462 474 481 520 522 530 538 545 549 568 569 582 584 594 602 605 605 615 635 637 670 692 696 699 720 720 724 737 746 762 779 808 811 813 832 871 871 895 896 898 915 922 928 935 940 941 946 970 975 996", firstPartitionOperationOutput);
        
    }

    @Test
    @GradedTest(name="Test 6 (QuickSort Operation 3)", max_score=2)
    public void testQuickSortOperation3() throws FileNotFoundException, IOException {

        String fileName = "./tests/qs3.txt";
		prepareInputDataFromText(fileName);
		
		QuickSort qs = new QuickSort();
		String generatedOutput = qs.quickSortOperation(inputArray);

        if(MyStackTrace.recursiveRunCount < 20){
            generatedOutput = "You need to use recursive procedure";
        }

        
        assertEquals("5 16 18 24 24 27 36 40 54 61 62 68 69 77 83 89 114 135 154 162 194 211 215 225 227 235 236 238 249 263 267 267 272 284 285 297 303 309 310 322 334 335 351 361 365 375 385 392 431 453 462 474 481 520 522 530 538 545 549 568 569 582 584 594 602 605 605 615 635 637 670 692 696 699 720 720 724 737 746 762 779 808 811 813 832 871 871 895 896 898 915 922 928 935 940 941 946 970 975 996", generatedOutput);

    }

    @Test
    @GradedTest(name="Test 7 (Partition operation 4)", max_score=2)
    public void testPartitionOperation4() throws FileNotFoundException, IOException {

        String fileName = "./tests/qs4.txt";
		prepareInputDataFromText(fileName);
		
		QuickSort qs = new QuickSort();
        int[] clonnedArrForPartitionCheck = inputArray.clone();
		int pivotPosition = qs.inPlacePartition(clonnedArrForPartitionCheck, 0, clonnedArrForPartitionCheck.length - 1);
		//System.out.println(pivotPosition);
		String firstPartitionOperationOutput = printArray(clonnedArrForPartitionCheck);

        assertEquals("15 147 160 19 20 58 65 141 9 62 67 144 139 94 74 103 57 70 38 108 157 76 68 11 36 106 58 99 120 23 144 94 35 144 170 146 164 75 20 112 22 25 18 129 131 119 83 172 39 33 79 35 36 123 123 138 113 63 73 2 142 21 91 95 178 99 174 10 181 121 58 177 174 19 40 139 140 28 106 38 43 104 180 134 162 89 24 153 8 89 50 155 100 138 62 164 104 120 119 60 139 102 137 182 94 104 2 114 44 46 120 71 58 124 9 115 110 99 20 108 58 14 178 37 30 136 79 151 57 150 108 172 39 146 145 85 65 135 122 58 166 3 159 152 104 1 59 53 5 7 54 114 6 16 43 138 8 4 163 78 170 124 181 45 116 27 177 59 182 877 810 367 638 516 568 206 534 763 789 409 294 611 921 756 294 454 916 442 714 797 184 497 257 331 888 367 325 726 330 231 425 483 874 676 947 296 684 529 972 940 854 717 881 906 470 312 401 244 881 832 289 990 573 651 439 721 850 402 514 503 532 723 777 799 250 834 682 547 427 546 199 670 620 465 463 918 480 223 636 521 732 797 452 919 790 967 620 337 277 463 534 194 466 649 188 902 623 788 623 997 457 357 366 382 417 439 644 402 852 743 915 907 345 194 881 476 437 952 727 877 720 887 344 450 871 634 972 981 409 702 700 462 988 843 856 331 946 387 250 300 921 716 803 418 653 474 323 815 848 219 509 223 373 569 423 785 767 279 263 231 463 486 662 254 946 737 833 532 845 564 907 645 422 627 628 939 243 516 690 671 264 957 346 674 809 205 481 355 774 276 704 955 384 583 684 193 882 847 559 935 386 560 218 998 960 449 337 250 980 218 982 925 531 267 548 555 696 398 451 676 282 958 375 513 676 606 793 652 566 519 791 379 231 861 323 888 204 662 568 584 879 299 587 620 437 385 899 394 214 746 439 262 847 261 228 801 190 672 278 543 999 465 538 477 865 290 914 892 630 783 922 744 265 904 962 900 445 819 548 603 218 330 913 428 577 294 992 659 491 911 709 918 666 900 620 817 492 620 241 246 317 367 620 637 900 282 683 503 347 412 699 335 810 988 404 885 499 349 385 656 519 553 608 358 838 403 729 965 202 784 191 986 250 679 516 439 852 213 381 711 213 291 251 270 951 313 267 736 701 911 554 993 959 547 968 991 305 594 721 528 378 878 940 696 781 304 623 366 516 559 873 326 249 734 811 202 667 622 986 330 674 369 415 899 485 536 867 333 778 714 892 383 847 461 667 246 632 705 773 775 195 273 955 200 502 282 259 307 518 516 652 405 516 387 719 821 980 333 710 428 198 278 611 762 804 404 238 337 821 949 284 861 325 783 664 817 713 492 999 629 241 785 551 714 287 903 759 327 444 450 286 701 954 459 205 798 406 484 202 241 369 693 621 839 279 281 574 558 279 376 797 547 408 942 759 309 344 192 649 370 859 847 953 380 996 709 391 804 573 522 614 696 880 381 567 847 290 582 601 699 585 703 314 690 266 845 723 584 564 238 632 640 738 671 532 921 711 668 928 726 235 363 400 383 971 454 826 784 584 597 635 950 379 445 658 277 504 262 391 419 946 543 355 864 392 717 313 445 494 684 407 876 250 214 628 495 596 237 488 305 293 271 210 318 826 426 483 993 965 471 359 488 811 867 858 765 574 807 830 611 248 985 486 931 190 922 621 987 949 546 966 379 791 636 767 978 281 667 983 271 498 200 921 885 986 778 875 385 413 446 973 980 950 825 787 316 860 749 598 924 618 294 183 369 524 826 561 720 908 823 353 414 931 639 325 302 523 827 621 565 547 444 475 981 572 595 315 676 298 609 402 368 840 887 988 598 723 988 509 669 666 262 522 382 281 277 965 400 383 618 812 811 380 316 484 391 814 969 933 467 627 327 228 871 889 969 397 366 714 258 339 480 707 328 249 186 864 742 683 692 602 271 913 627 707 445 354 250 694 257 321 297 441 354 678 624 311 192 731 856 995 578 937 669 890 190 234 340 758 319 935 431 727 669 725 321 639 575 968 188 490 263 208 403 255 468 286 699 248 530 357 521 928 999 774 955 937 608 768 478 726 675 501 643 886 402 465 501 791 418 989 714 347 447 240 214 495 830 687 767 927 736 963 545 229 914 970 839 643 650 796 954 910 663 550 700 707 658 955 406 254 404 511 347 623 259 424 883 765 680 412 983 763 187 503 698 763 242 354 411 508 412 725 847 866 596 396 225 914 563", firstPartitionOperationOutput);
        
    }

    @Test
    @GradedTest(name="Test 8 (QuickSort Operation 4)", max_score=2)
    public void testQuickSortOperation4() throws FileNotFoundException, IOException {

        String fileName = "./tests/qs4.txt";
		prepareInputDataFromText(fileName);
		
		QuickSort qs = new QuickSort();
		String generatedOutput = qs.quickSortOperation(inputArray);

        if(MyStackTrace.recursiveRunCount < 20){
            generatedOutput = "You need to use recursive procedure";
        }

        
        assertEquals("1 2 2 3 4 5 6 7 8 8 9 9 10 11 14 15 16 18 19 19 20 20 20 21 22 23 24 25 27 28 30 33 35 35 36 36 37 38 38 39 39 40 43 43 44 45 46 50 53 54 57 57 58 58 58 58 58 58 59 59 60 62 62 63 65 65 67 68 70 71 73 74 75 76 78 79 79 83 85 89 89 91 94 94 94 95 99 99 99 100 102 103 104 104 104 104 106 106 108 108 108 110 112 113 114 114 115 116 119 119 120 120 120 121 122 123 123 124 124 129 131 134 135 136 137 138 138 138 139 139 139 140 141 142 144 144 144 145 146 146 147 150 151 152 153 155 157 159 160 162 163 164 164 166 170 170 172 172 174 174 177 177 178 178 180 181 181 182 182 183 184 186 187 188 188 190 190 190 191 192 192 193 194 194 195 198 199 200 200 202 202 202 204 205 205 206 208 210 213 213 214 214 214 218 218 218 219 223 223 225 228 228 229 231 231 231 234 235 237 238 238 240 241 241 241 242 243 244 246 246 248 248 249 249 250 250 250 250 250 250 251 254 254 255 257 257 258 259 259 261 262 262 262 263 263 264 265 266 267 267 270 271 271 271 273 276 277 277 277 278 278 279 279 279 281 281 281 282 282 282 284 286 286 287 289 290 290 291 293 294 294 294 294 296 297 298 299 300 302 304 305 305 307 309 311 312 313 313 314 315 316 316 317 318 319 321 321 323 323 325 325 325 326 327 327 328 330 330 330 331 331 333 333 335 337 337 337 339 340 344 344 345 346 347 347 347 349 353 354 354 354 355 355 357 357 358 359 363 366 366 366 367 367 367 368 369 369 369 370 373 375 376 378 379 379 379 380 380 381 381 382 382 383 383 383 384 385 385 385 386 387 387 391 391 391 392 394 396 397 398 400 400 401 402 402 402 402 403 403 404 404 404 405 406 406 407 408 409 409 411 412 412 412 413 414 415 417 418 418 419 422 423 424 425 426 427 428 428 431 437 437 439 439 439 439 441 442 444 444 445 445 445 445 446 447 449 450 450 451 452 454 454 457 459 461 462 463 463 463 465 465 465 466 467 468 470 471 474 475 476 477 478 480 480 481 483 483 484 484 485 486 486 488 488 490 491 492 492 494 495 495 497 498 499 501 501 502 503 503 503 504 508 509 509 511 513 514 516 516 516 516 516 516 518 519 519 521 521 522 522 523 524 528 529 530 531 532 532 532 534 534 536 538 543 543 545 546 546 547 547 547 547 548 548 550 551 553 554 555 558 559 559 560 561 563 564 564 565 566 567 568 568 569 572 573 573 574 574 575 577 578 582 583 584 584 584 585 587 594 595 596 596 597 598 598 601 602 603 606 608 608 609 611 611 611 614 618 618 620 620 620 620 620 620 621 621 621 622 623 623 623 623 624 627 627 627 628 628 629 630 632 632 634 635 636 636 637 638 639 639 640 643 643 644 645 649 649 650 651 652 652 653 656 658 658 659 662 662 663 664 666 666 667 667 667 668 669 669 669 670 671 671 672 674 674 675 676 676 676 676 678 679 680 682 683 683 684 684 684 687 690 690 692 693 694 696 696 696 698 699 699 699 700 700 701 701 702 703 704 705 707 707 707 709 709 710 711 711 713 714 714 714 714 714 716 717 717 719 720 720 721 721 723 723 723 725 725 726 726 726 727 727 729 731 732 734 736 736 737 738 742 743 744 746 749 756 758 759 759 762 763 763 763 765 765 767 767 767 768 773 774 774 775 777 778 778 781 783 783 784 784 785 785 787 788 789 790 791 791 791 793 796 797 797 797 798 799 801 803 804 804 807 809 810 810 811 811 811 812 814 815 817 817 819 821 821 823 825 826 826 826 827 830 830 832 833 834 838 839 839 840 843 845 845 847 847 847 847 847 847 848 850 852 852 854 856 856 858 859 860 861 861 864 864 865 866 867 867 871 871 873 874 875 876 877 877 878 879 880 881 881 881 882 883 885 885 886 887 887 888 888 889 890 892 892 899 899 900 900 900 902 903 904 906 907 907 908 910 911 911 913 913 914 914 914 915 916 918 918 919 921 921 921 921 922 922 924 925 927 928 928 931 931 933 935 935 937 937 939 940 940 942 946 946 946 947 949 949 950 950 951 952 953 954 954 955 955 955 955 957 958 959 960 962 963 965 965 965 966 967 968 968 969 969 970 971 972 972 973 978 980 980 980 981 981 982 983 983 985 986 986 986 987 988 988 988 988 989 990 991 992 993 993 995 996 997 998 999 999 999", generatedOutput);

    }

    @Test
    @GradedTest(name="Test 9 (Partition operation 5)", max_score=2)
    public void testPartitionOperation5() throws FileNotFoundException, IOException {

        String fileName = "./tests/qs5.txt";
		prepareInputDataFromText(fileName);
		
		QuickSort qs = new QuickSort();
        int[] clonnedArrForPartitionCheck = inputArray.clone();
		int pivotPosition = qs.inPlacePartition(clonnedArrForPartitionCheck, 0, clonnedArrForPartitionCheck.length - 1);
		//System.out.println(pivotPosition);
		String firstPartitionOperationOutput = printArray(clonnedArrForPartitionCheck);

        assertEquals("1 2 2 3 4 5 6 7 8 8 9 9 10 11 14 15 16 18 19 19 20 20 20 21 22 23 24 25 27 28 30 33 35 35 36 36 37 38 38 39 39 40 43 43 44 45 46 50 53 54 57 57 58 58 58 58 58 58 59 59 60 62 62 63 65 65 67 68 70 71 73 74 75 76 78 79 79 83 85 89 89 91 94 94 94 95 99 99 99 100 102 103 104 104 104 104 106 106 108 108 108 110 112 113 114 114 115 116 119 119 120 120 120 121 122 123 123 124 124 129 131 134 135 136 137 138 138 138 139 139 139 140 141 142 144 144 144 145 146 146 147 150 151 152 153 155 157 159 160 162 163 164 164 166 170 170 172 172 174 174 177 177 178 178 180 181 181 182 182 183 184 186 187 188 188 190 190 190 191 192 192 193 194 194 195 198 199 200 200 202 202 202 204 205 205 206 208 210 213 213 214 214 214 218 218 218 219 223 223 225 228 228 229 231 231 231 234 235 237 238 238 240 241 241 241 242 243 244 246 246 248 248 249 249 250 250 250 250 250 250 251 254 254 255 257 257 258 259 259 261 262 262 262 263 263 264 265 266 267 267 270 271 271 271 273 276 277 277 277 278 278 279 279 279 281 281 281 282 282 282 284 286 286 287 289 290 290 291 293 294 294 294 294 296 297 298 299 300 302 304 305 305 307 309 311 312 313 313 314 315 316 316 317 318 319 321 321 323 323 325 325 325 326 327 327 328 330 330 330 331 331 333 333 335 337 337 337 339 340 344 344 345 346 347 347 347 349 353 354 354 354 355 355 357 357 358 359 363 366 366 366 367 367 367 368 369 369 369 370 373 375 376 378 379 379 379 380 380 381 381 382 382 383 383 383 384 385 385 385 386 387 387 391 391 391 392 394 396 397 398 400 400 401 402 402 402 402 403 403 404 404 404 405 406 406 407 408 409 409 411 412 412 412 413 414 415 417 418 418 419 422 423 424 425 426 427 428 428 431 437 437 439 439 439 439 441 442 444 444 445 445 445 445 446 447 449 450 450 451 452 454 454 457 459 461 462 463 463 463 465 465 465 466 467 468 470 471 474 475 476 477 478 480 480 481 483 483 484 484 485 486 486 488 488 490 491 492 492 494 495 495 497 498 499 501 501 502 503 503 503 504 508 509 509 511 513 514 516 516 516 516 516 516 518 519 519 521 521 522 522 523 524 528 529 530 531 532 532 532 534 534 536 538 543 543 545 546 546 547 547 547 547 548 548 550 551 553 554 555 558 559 559 560 561 563 564 564 565 566 567 568 568 569 572 573 573 574 574 575 577 578 582 583 584 584 584 585 587 594 595 596 596 597 598 598 601 602 603 606 608 608 609 611 611 611 614 618 618 620 620 620 620 620 620 621 621 621 622 623 623 623 623 624 627 627 627 628 628 629 630 632 632 634 635 636 636 637 638 639 639 640 643 643 644 645 649 649 650 651 652 652 653 656 658 658 659 662 662 663 664 666 666 667 667 667 668 669 669 669 670 671 671 672 674 674 675 676 676 676 676 678 679 680 682 683 683 684 684 684 687 690 690 692 693 694 696 696 696 698 699 699 699 700 700 701 701 702 703 704 705 707 707 707 709 709 710 711 711 713 714 714 714 714 714 716 717 717 719 720 720 721 721 723 723 723 725 725 726 726 726 727 727 729 731 732 734 736 736 737 738 742 743 744 746 749 756 758 759 759 762 763 763 763 765 765 767 767 767 768 773 774 774 775 777 778 778 781 783 783 784 784 785 785 787 788 789 790 791 791 791 793 796 797 797 797 798 799 801 803 804 804 807 809 810 810 811 811 811 812 814 815 817 817 819 821 821 823 825 826 826 826 827 830 830 832 833 834 838 839 839 840 843 845 845 847 847 847 847 847 847 848 850 852 852 854 856 856 858 859 860 861 861 864 864 865 866 867 867 871 871 873 874 875 876 877 877 878 879 880 881 881 881 882 883 885 885 886 887 887 888 888 889 890 892 892 899 899 900 900 900 902 903 904 906 907 907 908 910 911 911 913 913 914 914 914 915 916 918 918 919 921 921 921 921 922 922 924 925 927 928 928 931 931 933 935 935 937 937 939 940 940 942 946 946 946 947 949 949 950 950 951 952 953 954 954 955 955 955 955 957 958 959 960 962 963 965 965 965 966 967 968 968 969 969 970 971 972 972 973 978 980 980 980 981 981 982 983 983 985 986 986 986 987 988 988 988 988 989 990 991 992 993 993 995 996 997 998 999 999 999", firstPartitionOperationOutput);
        
    }

    @Test
    @GradedTest(name="Test 10 (QuickSort Operation 5)", max_score=2)
    public void testQuickSortOperation5() throws FileNotFoundException, IOException {

        String fileName = "./tests/qs5.txt";
		prepareInputDataFromText(fileName);
		
		QuickSort qs = new QuickSort();
		String generatedOutput = qs.quickSortOperation(inputArray);

        if(MyStackTrace.recursiveRunCount < 20){
            generatedOutput = "You need to use recursive procedure";
        }

        assertEquals("1 2 2 3 4 5 6 7 8 8 9 9 10 11 14 15 16 18 19 19 20 20 20 21 22 23 24 25 27 28 30 33 35 35 36 36 37 38 38 39 39 40 43 43 44 45 46 50 53 54 57 57 58 58 58 58 58 58 59 59 60 62 62 63 65 65 67 68 70 71 73 74 75 76 78 79 79 83 85 89 89 91 94 94 94 95 99 99 99 100 102 103 104 104 104 104 106 106 108 108 108 110 112 113 114 114 115 116 119 119 120 120 120 121 122 123 123 124 124 129 131 134 135 136 137 138 138 138 139 139 139 140 141 142 144 144 144 145 146 146 147 150 151 152 153 155 157 159 160 162 163 164 164 166 170 170 172 172 174 174 177 177 178 178 180 181 181 182 182 183 184 186 187 188 188 190 190 190 191 192 192 193 194 194 195 198 199 200 200 202 202 202 204 205 205 206 208 210 213 213 214 214 214 218 218 218 219 223 223 225 228 228 229 231 231 231 234 235 237 238 238 240 241 241 241 242 243 244 246 246 248 248 249 249 250 250 250 250 250 250 251 254 254 255 257 257 258 259 259 261 262 262 262 263 263 264 265 266 267 267 270 271 271 271 273 276 277 277 277 278 278 279 279 279 281 281 281 282 282 282 284 286 286 287 289 290 290 291 293 294 294 294 294 296 297 298 299 300 302 304 305 305 307 309 311 312 313 313 314 315 316 316 317 318 319 321 321 323 323 325 325 325 326 327 327 328 330 330 330 331 331 333 333 335 337 337 337 339 340 344 344 345 346 347 347 347 349 353 354 354 354 355 355 357 357 358 359 363 366 366 366 367 367 367 368 369 369 369 370 373 375 376 378 379 379 379 380 380 381 381 382 382 383 383 383 384 385 385 385 386 387 387 391 391 391 392 394 396 397 398 400 400 401 402 402 402 402 403 403 404 404 404 405 406 406 407 408 409 409 411 412 412 412 413 414 415 417 418 418 419 422 423 424 425 426 427 428 428 431 437 437 439 439 439 439 441 442 444 444 445 445 445 445 446 447 449 450 450 451 452 454 454 457 459 461 462 463 463 463 465 465 465 466 467 468 470 471 474 475 476 477 478 480 480 481 483 483 484 484 485 486 486 488 488 490 491 492 492 494 495 495 497 498 499 501 501 502 503 503 503 504 508 509 509 511 513 514 516 516 516 516 516 516 518 519 519 521 521 522 522 523 524 528 529 530 531 532 532 532 534 534 536 538 543 543 545 546 546 547 547 547 547 548 548 550 551 553 554 555 558 559 559 560 561 563 564 564 565 566 567 568 568 569 572 573 573 574 574 575 577 578 582 583 584 584 584 585 587 594 595 596 596 597 598 598 601 602 603 606 608 608 609 611 611 611 614 618 618 620 620 620 620 620 620 621 621 621 622 623 623 623 623 624 627 627 627 628 628 629 630 632 632 634 635 636 636 637 638 639 639 640 643 643 644 645 649 649 650 651 652 652 653 656 658 658 659 662 662 663 664 666 666 667 667 667 668 669 669 669 670 671 671 672 674 674 675 676 676 676 676 678 679 680 682 683 683 684 684 684 687 690 690 692 693 694 696 696 696 698 699 699 699 700 700 701 701 702 703 704 705 707 707 707 709 709 710 711 711 713 714 714 714 714 714 716 717 717 719 720 720 721 721 723 723 723 725 725 726 726 726 727 727 729 731 732 734 736 736 737 738 742 743 744 746 749 756 758 759 759 762 763 763 763 765 765 767 767 767 768 773 774 774 775 777 778 778 781 783 783 784 784 785 785 787 788 789 790 791 791 791 793 796 797 797 797 798 799 801 803 804 804 807 809 810 810 811 811 811 812 814 815 817 817 819 821 821 823 825 826 826 826 827 830 830 832 833 834 838 839 839 840 843 845 845 847 847 847 847 847 847 848 850 852 852 854 856 856 858 859 860 861 861 864 864 865 866 867 867 871 871 873 874 875 876 877 877 878 879 880 881 881 881 882 883 885 885 886 887 887 888 888 889 890 892 892 899 899 900 900 900 902 903 904 906 907 907 908 910 911 911 913 913 914 914 914 915 916 918 918 919 921 921 921 921 922 922 924 925 927 928 928 931 931 933 935 935 937 937 939 940 940 942 946 946 946 947 949 949 950 950 951 952 953 954 954 955 955 955 955 957 958 959 960 962 963 965 965 965 966 967 968 968 969 969 970 971 972 972 973 978 980 980 980 981 981 982 983 983 985 986 986 986 987 988 988 988 988 989 990 991 992 993 993 995 996 997 998 999 999 999", generatedOutput);

    }


    
}