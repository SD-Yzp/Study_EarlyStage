data = [ ["北京理工大学", "985", 2000], \
         ["清华大学", "985", 3000], \
         ["大连理工大学", "985", 4000], \
         ["深圳大学", "211", 2000], \
         ["沈阳大学", "省本", 2000], \
    ]
import tabulate
print(tabulate.tabulate(data, tablefmt="grid"))