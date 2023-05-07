# Java Self Education 
Java Türkçe Kaynak

* JDK'nın Linux Ortamına Kurulumu İçin Terminal Komutları

İlk olarak aşağıdaki komutları terminalde sırasıyla çalıştıralım.
1. sudo apt-add-repository ppa:webupd8team/java
2. sudo apt-get update
3. sudo apt-get install oracle-java8-installer

Bu işlemleri yaptığımız zaman JDK Linux ortamına kurulmuş olacak.

Daha sonra Java Derleyicisini (javac) ve Java Yorumlayıcısını ( java ) terminalde çalıştırmak için JDK ve JRE'yi Linux Path'ine ekliyoruz.

İlk olarak terminal kullanarak aşağıdaki komutu çalıştıralım ve profile dosyamızı açalım.
* sudo gedit /etc/profile

Profile dosyamızı açtıktan sonra aşağıdaki satırı bu dosyanın en altına yapıştıralım ve dosyamızı kaydedelim.
*  export JAVA_HOME=/usr/lib/jvm/java-8-oracle

Buradaki tüm işlemleri gerçekleştirdikten sonra işlemlerimiz sona ermiş olacak.


* Netbeans IDE'nin Linux Ortamına Kurulumu

Netbeans'i Linux Ortamına kurmak için aşağıdaki işlemleri sırasıyla uygulayın.

* Netbeans IDE'nin download sayfasından Linux için olan sürümünü bilgisayarınıza indirin.
* Dosya indikten sonra, Desktop'un altında "Netbeans" isimli bir klasör oluşturun ve indirdiğiniz .sh uzantılı dosyayı buraya taşıyın.
* Home klasörünün altında gizli bir dosya olan .bashrc dosyasını açın ve içine alttaki satırları kopyalayın ve .bashrc dosyasını kaydedin.
  export JAVA_HOME=/usr/lib/jvm/java-8-oracle export PATH=$PATH:/usr/lib/jvm/java-8-oracle/bin

Not : Linux ortamında gizli dosyaları CTRL + H ile gösterebilirsiniz.

* Terminalde Desktop'un altında oluşturduğumuz Netbeans klasörüne gelin ve ilk olarak .sh uzantılı kurulum dosyasına çalıştırma izni vermek için alttaki komutu kullanın.
  sudo chmod +x netbeans-*
* Daha sonra .sh uzantılı dosyayı alttaki komutu uygulayarak çalıştırın ve videoda izlenen adımları takip edin.
  sudo ./netbeans-*
  Bu işlemleri sırayla yaptığınız zaman Netbeans Linux ortamınıza kurulmuş olacak.


JDK'yı Mac OS X Ortamına Kurmak

https://www.youtube.com/watch?v=y6szNJ4rMZ0

Netbeans IDE'nin Mac OS X Ortamına Kurulumu

https://www.youtube.com/watch?v=jTlYrXopwO0

https://www.youtube.com/watch?v=FO8iPIr60Hk


Intellij IDEA Community Edition Mac OS, Windows ve Linux indirme ve kurulum

https://www.jetbrains.com/idea/download/#section=mac