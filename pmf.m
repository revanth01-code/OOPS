%Matlab Code:PMF, Mean, Variance, S.D and CDF of a discrete random variable

%Input: Values of the random variable and their probabilities 
disp('Enter the values of the random variable (X):');
X=input('X=');
disp('Enter the corresponding probabilities (P) such that sum(P)=1:');
P=input('P=');

%Check if probabilities sum to 1
if abs(sum(P)-1)>1e-6
    error('The probabilities must sum to 1.');
end

%Display the probability Mass Function(PMF)
fprintf('\nProbability Mass Function(PMF):\n');
for i=1:length(X)
    fprintf('P(x=%d)=%.4f\n',X(i),P(i));
end

%Calculate the mean
mean_X=sum(X.*P);
fprintf('\nMean:%.4f\n',mean_X);

%Calculate the variance
variance_X=sum((X-mean_X).^2.*P);
fprintf('Variance:%.4f\n',variance_X);

%Calculate the standard deviation
std_dev_X=sqrt(variance_X);
fprintf('Standard Deviation:%.4f\n',std_dev_X);

%Calculate the cumulative distribution function(CDF)
CDF=cumsum(P);
fprintf('\nCumulative Distribution Function(CDF):\n');
for i=1:length(X)
    fprintf('F(X<=%d)=%.4f\n',X(i),CDF(i));
end

%Optional:Plot the PMF and CDF
figure;
%Plot PMF
subplot(1,2,1);
stem(X,P,'b','LineWidth',1.5);
title('PMF');
xlabel('X');
ylabel('P(X)');
grid on;

%
%Plot CDF
subplot(1,2,2);
stairs(X,CDF,'r','LineWidth',1.5);
title('CDF');
xlabel('X');
ylabel('F(X)');
grid on;