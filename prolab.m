%% Write a matlab code for mean,variance and standard deviation for a binomial distribution

%Input paramters for the binomial distribution

disp('Binomial distribution parameters:');
n=input('enter the number of trails(n):');
p=input('Enter the probability of success(P):');

%check parameters are valid
if n<=0 || p<0 || p>1
    error('Invalid parameters.Ensure n>0 and 0<=P<=1.');
end
%Define the range of possible outcomes (o to n)
X = 0:n;
%compute the bino,ial probability mass function
P=binopdf(X,n,p);
%display the PMF
disp('Probability Mass Function(PMF):');
for i = 1:length(X)
    fprintf('P(X=%d) =%.4f\n',X(i),P(i));
end
%compute the mean of the binomial distribution 
mean_X = n*p;
disp('Mean (E[X]):');
disp(mean_X);

%compute the variance of a binomial distribution
variance_X = n*p*(1-p);
disp('Variance(Var[X]):');
disp(variance_X);
%compute the sandard deviation of the binomail distribution
std_dev_X = sqrt(variance_X);
disp('Standard Deviation(Std Dev):');
disp(std_dev_X);

%optional plot the PMF FIgure;
stem(X,P,'b','LineWidth',1.5);
title('Binomial Probability Mass Function(PMF)');
xlabel('X(Number of succesess)');
ylabel('P(X)');
grid on;