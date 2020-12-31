package com.brainybrains.kamservices.pogs;

import com.brainybrains.kamservices.R;

import java.util.ArrayList;

public class comments {
    private String name, comments;
    private int image;

    public comments() {
    }


    public comments(String name, String comments, int image) {
        this.name = name;
        this.comments = comments;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ArrayList<comments> allProduct(){
        ArrayList<comments> allProduct=new ArrayList<>();

        allProduct.add(new comments("Nicholas Obrien","What was beyond the bend in the stream was unknown. Both were curious, but only one was brave enough to want to explore. That was the problem. There was always one that let fear rule her life.", R.drawable.one));
        allProduct.add(new comments("Joan Cross","Then came the night of the first falling star. It was seen early in the morning, rushing over Winchester eastward, a line of flame high in the atmosphere. Hundreds must have seen it and taken it for an ordinary falling star. It seemed that it fell to earth about one hundred miles east of him.", R.drawable.two));
        allProduct.add(new comments("Mike Schultz","She counted. One. She could hear the steps coming closer. Two. Puffs of breath could be seen coming from his mouth. Three. He stopped beside her. Four. She pulled the trigger of the gun.", R.drawable.three));
        allProduct.add(new comments("Gwen Coleman","Do you think you're living an ordinary life? You are so mistaken it's difficult to even explain. The mere fact that you exist makes you extraordinary. The odds of you existing are less than winning the lottery, but here you are. Are you going to let this extraordinary opportunity pass?", R.drawable.four));
        allProduct.add(new comments("Mona Mullins","She tried not to judge him. His ratty clothes and unkempt hair made him look homeless. Was he really the next Einstein as she had been told? On the off chance it was true, she continued to try not to judge him.", R.drawable.five));
        allProduct.add(new comments("Lee Ramirez","The boy walked down the street in a carefree way, playing without notice of what was about him. He didn't hear the sound of the car as his ball careened into the road. He took a step toward it, and in doing so sealed his fate.", R.drawable.three));
        allProduct.add(new comments("Don Hayes","He heard the loud impact before he ever saw the result. It had been so loud that it had actually made him jump back in his seat. As soon as he recovered from the surprise, he saw the crack in the windshield. It seemed to be an analogy of the current condition of his life.", R.drawable.two));
        allProduct.add(new comments("Rudolph Goodman","Cake or pie? I can tell a lot about you by which one you pick. It may seem silly, but cake people and pie people are really different. I know which one I hope you are, but that's not for me to decide. So, what is it? Cake or pie?", R.drawable.one));
        allProduct.add(new comments("Sergio Massey","She wanted rainbow hair. That's what she told the hairdresser. It should be deep rainbow colors, too. She wasn't interested in pastel rainbow hair. She wanted it deep and vibrant so there was no doubt that she had done this on purpose.", R.drawable.five));

        return allProduct;


    }
}
