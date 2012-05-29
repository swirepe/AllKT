# All of Knowledge Tracing
Peter Swire - swirepe.com

## What is it

A research project on bayesian knowledge tracing.  You can see the paper in progress [here](https://docs.google.com/document/d/1wdfwoIpd0G6zJDcPPzO83T0rkdAhbTUX9bymOHxykrI/edit).

**Abstract:**

>Bayesian Knowledge Tracing is a simple, interpretable method for inferring a student's knowledge of a subject.  Given a student's responses to questions regarding a single skill, it captures four probabilities: the probability the student knew the skill before starting, the probability the student will learn the skill, the probability they will guess a question right, and the probability they will slip and answer a question wrong.  These are only four parameters per skill, but this is a lot: a tutoring system like ASSISTments can have hundreds of skills, and sparsity issues can lead to inaccurately-trained models.
>
>This paper proposes a method to side-step the issue of training individual knowledge tracing models.  The interprebility of Knowledge Tracing allowed us to overlay semantic constraints on the search space.  These constraints let us then roll the entire search space into a single model, effectively making Knowledge Tracing parameterless.


# How to use it

    java -jar jar/main.jar configfile.properties

or 

    java -jar jar/predict.jar experiment_name train.csv test.csv

    


## What it uses

[JUnit](http://www.junit.org/) - Common Public License

[XStream](http://xstream.codehaus.org) - BSD

[sqljet](http://sqljet.com/) - GPL
