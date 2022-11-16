pipeline
{
  agent any
  
  stages
  {
    stage('Checkout Git')
    {
      steps
      {
        echo 'Pulling'
        git branch : 'main'
        url : 'https://github.com/JmSkan141195/testValidation.git'
      }
    }
  }
}
