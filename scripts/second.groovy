import java.sql.*
import groovy.sql.Sql
import groovy.util.CliBuilder
import oracle.jdbc.pool.OracleDataSource;


def cli = new CliBuilder(usage: 'This is my command.')
cli.u(longOpt: 'user', args:1, argName:'user', 'Oracle username.')
cli.p(longOpt: 'pw', args:1, argName:'pw', 'Oracle password.')
cli.c(longOpt: 'cmd', args:1, argName:'cmd', 'Command, one of a|b|c')
def options = cli.parse(args)

def sql = Sql.newInstance("jdbc:oracle:thin:@//esoravm4.es.dupont.com:1521/appspd", "sa", "sa")

cli.usage()

println "User: ${options.user}, PW: ${options.pw}, Cmd: ${options.cmd}"
