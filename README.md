# Тест-кейсы
## 1. Проверка устойчивости строки поиска к SQL-инъекциям
### Предусловие
Перейти на  [главную страницу](https://opm-website.iot-asm-test1.insitech.live)

### Шаги выполнения
По очереди ввести инъекции, после проверки каждой из которых очищать строку поиска.

Инъекции:
1) `Iphone' --  SELECT * FROM users`
2) `' UNION SELECT username, password FROM users --`
3) `' OR model LIKE '%Iphone%'`
4) `' OR (SELECT COUNT(*) FROM users) > 0 --`

### Ожидаемый результат
После каждого ввода инъекции результат поиска пустой

## 2. Проверка отображения главной страницы при разных разрешениях браузера по ширине
### Предусловие
Открыть [главную страницу](https://opm-website.iot-asm-test1.insitech.live) в браузере в формате >= 1440 пикселей по ширине. При этом нижняя панель выглядит в виде "подпись + фото" гаджетов

### Шаги выполнения
1) Уменьшить ширину браузера до 1439 пикселей или меньше

### Ожидаемый результат
Нижняя панель изменила свой вид на "подпись + иконка" гаджетов

## 3. Проверка функционала строки поиска
### Предусловие
Перейти на  [главную страницу](https://opm-website.iot-asm-test1.insitech.live)

### Шаги выполнения
1) Ввеести в строку поиска "Iphone 13"
2) Дождаться окончания отработки спиннера
### Ожидаемый результат
1) Спиннер отобржается не более 3 секунд
2) После завершения его работы оторажаются результы поиска:

Смартфоны

    iPhone 13 Смартфон Apple 13

    iPhone 13 Pro Max Смартфон Apple 13

    iPhone 13 Pro Смартфон Apple 13

    iPhone 13 mini Смартфон Apple 13

Часы

    iPhone 13 Часы Apple Camera 13

    IPhone 13 Pro Часы Apple Camera 13

    iPhone 13 mini Часы Apple Camera 13

    IPhone 13 Pro Max Часы Apple Camera 13`
3) Результаты поиска не содержат других записей

## 4. Проверка динамического изменения иконок на нижней панели главной страницы
### Предусловие
Перейти на  [главную страницу](https://opm-website.iot-asm-test1.insitech.live)
### Шаги выполнения
1. Провести по каждой из кнопок из нижней панели курсором отдельно горизонтально справа-налево и отдельно, так и вертикально - сверху-вниз обратно
### Ожидаемый результат
1. При горизонтальном движении фото на кнопках меняются.
2. При вертикальеном движении фото на кнопках **НЕ** меняются.

## 5. Проверка списков производителей устройств
### Предусловие
Перейти на  [главную страницу](https://opm-website.iot-asm-test1.insitech.live)
### Шаги выполнения
1. Нажать кнопку "Консоль" на нижней панели
2. Дождаться отработки спиннера
3. Получить список производителей из левого столбца
4. Перейти в категории "Планшет", "Смартфон", "Часы", "Камера" и после отработки спиннера получить списки производителей

### Ожидаемый результат
1. Спиннер всегда отображается не более 3 секунд
2. Список производителей консолей содержит:
* Nintendo
* GPD
* Microsoft
* Sony
* Nvidia
* Valve
* PGP
3. Список производителей планшетов состоит из записей:

* Apple Lenovo
* Samsung
* Honor
* Huawei
* Asus
* Arian
* Turbo
* Acer
* Dell
* Archos
* Inoi
* Amazon
* E-Ten
* Pixus
* Microsoft
* LG
* Bobarry
* Fujitsu
* Senseit
* TCL
* Boox Darwin
* Ownice
* Lowrance
* Casper
* Pioneer
* Haier
* Xiaomi
* Torex
* Runbo
* Huion
* Lexand
* KREZ
* Micromax
* Sunwind
* BDF
* Land Rover
* ONYX BOOX
* Qumo
* Beeline
* BMW
* HP
* Motorola
* BB-mobile
* HUMMINBIRD
* Teyes
* IQOS
* HTC
* DEXP
* Glo
* Oysters
* PiPO
* Nokia
* Eplutus
* Nomi
* Sigma
* Vomi
* Vodafone
* LaunchRover
* Xgody
* Digma
* Coolpad
* XP-PEN
* Aqua Veronese
* Oppo
* Exeq
* Gaomon
* Garmin
* Irbis
* Prestigio
* Evotor
* OEM
* Alcatel
* Navitel
* Perfeo
* BQ
* Blackview
* Autel
* Wacom
* OCOnda
* Sony
* Alldocube
* China
* PocketBook
* Chuwi
* Realme
* Vertex
* Blackmagic
* OKSIVK
* World
* Explay
* HDTOSNER
* TurboPad
* Allwinner
* Aqua Veronese
* Vaxis
* Panasonic
* Rollup
* VANWIN
* Hunter
* One
* Megafon
* Intro
* Kruger&Matz
* Inspire
* Cube
* Feelworld
* China Samsung
* Lowrance
* Doogee
* MI
* GOukitel
* Ergo
* Navistart
* GPD
* 4good
* Hotwav
* ZTE
* maimeite
* Wuxian
* Topdevice
* OnePlus
* Umiio
* Mercedes
* Audi
* Redmi
* UNIWA
* Cubot
* Google
* F+
* Yandex
* SmartX
* Tecno
* Yadro
* TECLAST
* Mi
* Ginzzu
* AGMTablet
* PCX
* -Prime
* Hyundai
* KENSHI
* xiao mi
* Idutex
* HIGOLE
* Vivo
* W&O
* Winca
* Atomos
* Lada
* Street
* OTOFIX
* Lingbo
* Ulefone
* Jaecoo

Список производителей смартфонов состоит из записей:
* Apple
* Honor
* Samsung
* OnePlus
* Xiaomi
* Realme
* Tecno
* Huawei
* Oppo
* Infinix
* Vivo
* Nothing
* Le
* Eco
* General Mobile
* Casper
* Alcatel
* Kodak
* Asus
* Lamborghini
* Google
* HTC
* Lenovo
* LG
* Yandex
* Energizer
* Meizu
* Micromax
* Motorola
* FoxxD
* Nokia
* Senseit
* iNew
* Sony
* Umidigi
* Runbo
* ZTE
* Conquest
* MaxviGome
* DNS
* PPTV
* Joys
* Lexand
* Caterpillar
* T-Mobile
* Vertu
* Megafon
* BB-mobile
* Irbis
* Land Rover
* Wiko
* Qumo
* Rover
* Phone
* Cubot
* Sugar
* Intex
* Jiayu
* LYF
* Marshall
* ARK
* MTS
* ThL
* Highscreen
* Honeywell
* Bluboo
* Symphony
* Canon
* Microsoft
* Doogee
* AllCall
* INOI
* Билайн
* Galavey Electronics
* Unihertz
* Uhans
* Vernee
* Elephone
* Lumus
* NOA
* WileyFox
* Gigabyte
* Zopo
* Gionee
* Mobiistar
* Homtom
* Oysters
* China
* Yotaphone
* Fujifilm
* Leioa
* Panasonic
* Jeep
* Oukitel
* Kugoo
* Mercedes
* Soyes
* Fiio
* Astell&Kern
* Iqos
* MyPhone
* Glo
* Haier
* YU
* Vestel
* Ulefone
* Plum
* AllView
* Nomi
* Philips
* TP-Link
* QMobile
* Digma
* Jinga
* Archos
* Vertex
* HP
* Vodafone
* Geecoo
* Olmio
* Coolpadi
* Basso
* Gooweel
* ZUKBQ
* Torex
* Walton
* Bezkam
* Nobby
* Cayin
* Fly
* Tele2
* Doov
* Fujitsu
* Itel
* RUIZU
* Leagoo
* Oscal
* DEXP
* Blackview
* Prestigio
* Nomu
* Polar
* Explay
* Mazete
* Xet
* Garmin
* Sony Ericsson
* UMi
* Baseus
* Sharp
* Palm
* Beeline
* Acer
* TOPCON
* Santin
* KXD
* Turbo
* Smartisan
* Navitel
* NUU Mobile
* Hotwav
* Stark
* Sunnzo
* AGMM-Horse
* Thurava
* 4Good
* InFocus
* Kyocera
* TCL
* Amigoo
* Vsmart
* Wigor
* Ginzzu
* Hisense
* Wigor1
* iLABLU
* Submersible
* Rug
* Gear
* Black Fox
* BlackBerry
* Silverstone
* Zebra
* EFT
* MIG
* Thuraya
* Pioneer
* Lumigon
* IXXIV
* Kworld
* Artel
* MODE 1
* Shanling
* ЗМТ
* Launch
* Aquarius
* F+
* techCORN
* Proverka
* Stonex
* A1
* Insta360
* INcell-screen
* Cowon
* Raptor
* Leitz
* China Mobile
* Fairphone
* Yandex
* Umiio
* Cuiud
* AIM
* Next
* Caterpillar
* QTECH
* Sky
* Fontel
* Astell&Kern
* Doro
* JVC
* ONYX BOOX
* Omix
* Kenshi
* Oskal

Список производителей часов состоит из записей:
* Apple
* Amazfit
* Infinix
* Xiaomi
* Samsung
* HONOR
* HIPER
* Garmin
* U Watch
* Sunwind
* Lenovo
* Motorola
* Meizu
* Herz
* Band
* Blackview
* Qumann
* Fitpolo
* Rode
* Google
* Red Line
* ColMi
* Realme
* Candino
* Emporio Armani
* Michael Kors
* Diesel
* Huawei
* China
* Rip Curl
* Elari
* Wenger
* Zepp
* OnePlus
* Tic
* Watch
* Canyon
* Ucom
* 123
* Geozon
* Doogee
* Jet
* Digma
* KREZ
* Casio
* Matrix
* Prolike
* MyKronoz
* Fitbit
* Fossil
* Philips
* KWART
* ZTE
* Mobvoi
* Vivo
* Skagen
* Asus
* Bizzaro
* Canon
* Suunto
* DM
* LEMFO
* Smarterra
* Polar
* Pringo
* Oppo
* Swatch
* Wonlex
* Smart watch
* Band
* Rate Smart
* Jing
* Tider
* Sony
* Jingtider
* Coros
* TC
* Lleef
* Irbis
* King
* Wear
* Yamaguchi
* Dizo
* Haylou
* Oukitel
* Universal
* Rungo
* Benjie k1V
* Kworld
* Healthband
* Tecno
* Knopka Zhizni
* Amigo
* DENN
* Dexp
* Soyes
* Peregrine
* Findmykids
* Kospet
* TFN
* Check
* ME
* Okami
* Fontel
* Aimotohocohoco
* Kieslect
* Hytera
* Smart Watch
* JUNITY
* Case
* Guru
* Ulefone
* Citizen
* Nothing
* Mobility
* Praktik
* Tiroki
* LK4
* Kakusiga
* ZDK

Список производителей камер состоит из записей:
* GoPro
* Atmos
* JVC
* Canon
* Panasonic
* Sony
* Olympus
* Nikon
* Fujifilm
* Digma
* R-wings
* GSMIN
* X-TRY
* Rekam
* Blackmagicyaz
* SJCAM
* Kodak
* China


# Автотест 
Для автоматизации был выбран последний тест-кейс, однако его работа заблокирована ошибкой доступа.
Проверено как с VPN, proxy, так и без них
Для запуска необходимо выполнить команду 
`mvn test`
или запустить из IDE метод testOpenConsolePageAndVerifyElements()
![Screenshot 2024-11-01 at 01.07.52.png](src/test/resources/Screenshot%202024-11-01%20at%2001.07.52.png)