Vagrant.configure("2") do |config|
  
  config.vm.define "master" do |master|
	master.vm.box = "ubuntu/xenial64"
	master.vm.hostname = "master"
	# master.vm.provision :shell, path: "scripts/bootstrap.sh"
	master.vm.network "private_network", ip: "192.168.33.10"
  end
  
  config.vm.define "worker1" do |worker1|
	worker1.vm.box = "ubuntu/xenial64"
	worker1.vm.hostname = "worker1"
	# master.vm.provision :shell, path: "scripts/bootstrap.sh"
	worker1.vm.network "private_network", ip: "192.168.33.20"
  end
  
  config.vm.define "worker2" do |worker2|
	worker2.vm.box = "ubuntu/xenial64"
	worker2.vm.hostname = "worker2"
	# master.vm.provision :shell, path: "scripts/bootstrap.sh"
	worker2.vm.network "private_network", ip: "192.168.33.30"
  end
 
end