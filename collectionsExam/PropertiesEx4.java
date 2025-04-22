package collectionsExam;

import java.util.Properties;

public class PropertiesEx4 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties(); 
        System.out.println("java.version:"+sysProp.getProperty("java.version"));
        System.out.println("user.language:"+sysProp.getProperty("user.language"));
        sysProp.list(System.out);
    }
}
/*
java.version:17.0.11
user.language:ko
-- listing properties --
java.specification.version=17
sun.cpu.isalist=amd64
sun.jnu.encoding=MS949
java.class.path=E:\studyworkspace\javastandard\MyAppl...
java.vm.vendor=Oracle Corporation
sun.arch.data.model=64
user.variant=
java.vendor.url=https://java.oracle.com/
java.vm.specification.version=17
os.name=Windows 10
sun.java.launcher=SUN_STANDARD
user.country=KR
sun.boot.library.path=C:\Program Files\Java\jdk-17\bin
sun.java.command=collectionsExam.PropertiesEx4
jdk.debug=release
sun.cpu.endian=little
user.home=C:\Users\sarony
user.language=ko
java.specification.vendor=Oracle Corporation
java.version.date=2024-04-16
java.home=C:\Program Files\Java\jdk-17
file.separator=\
java.vm.compressedOopsMode=32-bit
line.separator=

java.vm.specification.vendor=Oracle Corporation
java.specification.name=Java Platform API Specification
user.script=
sun.management.compiler=HotSpot 64-Bit Tiered Compilers
java.runtime.version=17.0.11+7-LTS-207
user.name=sarony
path.separator=;
os.version=10.0
java.runtime.name=Java(TM) SE Runtime Environment
file.encoding=UTF-8
java.vm.name=Java HotSpot(TM) 64-Bit Server VM
java.vendor.url.bug=https://bugreport.java.com/bugreport/
java.io.tmpdir=C:\Users\sarony\AppData\Local\Temp\
java.version=17.0.11
user.dir=E:\studyworkspace\javastandard\MyAppl...
os.arch=amd64
java.vm.specification.name=Java Virtual Machine Specification
sun.os.patch.level=
native.encoding=MS949
java.library.path=C:\Program Files\Java\jdk-17\bin;C:\W...
java.vm.info=mixed mode, sharing
java.vendor=Oracle Corporation
java.vm.version=17.0.11+7-LTS-207
sun.io.unicode.encoding=UnicodeLittle
java.class.version=61.0
 */