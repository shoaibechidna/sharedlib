pipelineJob('gradleexample') {
    definition {
        cps {
            sandbox()
            script("""
            @Library('pipeline-library')_

            stage('demo') {
              echo "under the job demo"
              hello 'shoaib'
            }

            stage('mavenbuild') {
              echo "cloning the petapp"

              node('master') {
                git 'https://github.com/shoaibechidna/spring-petclinic.git'
              }

              echo "under job maven"
              mavenjob 'false'
            }

            """.stripIndent())

        }
    }
}
