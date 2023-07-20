! Configurations pour le routeur Cisco IOS

hostname Router1

! Interface vers Switch1 (VLAN 10)
interface GigabitEthernet0/0
 description Connexion vers Switch1
 ip address 192.168.100.1 255.255.255.0
 no shutdown

! Interface vers Switch2 (VLAN 20)
interface GigabitEthernet0/1
 description Connexion vers Switch2
 ip address 192.168.200.1 255.255.255.0
 no shutdown


! Configurations pour Switch1 (VLAN 10)

enable
configure terminal

! Création du VLAN 10
vlan 10
 name Vlan10

! Affectation d'adresse IP à la VLAN 10
interface Vlan10
 ip address 192.168.100.2 255.255.255.0
 no shutdown

! Affectation des interfaces à la VLAN 10
interface range FastEthernet0/1-12
 switchport mode access
 switchport access vlan 10
 no shutdown

end
write memory


! Configurations pour Switch2 (VLAN 20)

enable
configure terminal

! Création du VLAN 20
vlan 20
 name Vlan20

! Affectation d'adresse IP à la VLAN 20
interface Vlan20
 ip address 192.168.200.2 255.255.255.0
 no shutdown

! Affectation des interfaces à la VLAN 20
interface range FastEthernet0/1-12
 switchport mode access
 switchport access vlan 20
 no shutdown

end
write memory
