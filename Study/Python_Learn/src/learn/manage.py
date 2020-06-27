import sys;
sys.path.append(r'D:\Eclipse\eclipse\plugins\org.python.pydev_2.7.3.2013031601\pysrc') #将pysrc加入到系统路径中
import pydevd #@UnresolvedImport
pydevd.patch_django_autoreload()