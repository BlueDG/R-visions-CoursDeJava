package exercice_1;

public class PremiereClasse {

	public static void main(String[] args) {
		
		System.out.print("Salut ça gaze?");
		System.out.println("Joe Bar Team");
		// le ln après le print permet de sauter une ligne à la fin du string
		System.out.println("Exemple du saut de ligne");
		
		
		// un fichier .Ja est un executable, permet de lancer plein de fichiers java
		// il est composé de fichiers .class
		// le .class est la version compilée du .java 
		// .java est là où est situé mon code. 
		// un java PremiereClasse va permettre d'executer mon fichier
		// javac PremiereClasse.java va lui compiler mon fichier et voir si il contient ou non des erreurs
		// javac qui compile "réactualise" mon travail et le sauvegarde également dans .class
		
		
		byte temperature = 7;
		// ma variable temperature vaut ici 7
		System.out.println(temperature);
		// ici on affiche la valeur de cette variable
		
		short vitesse = 20;
		// la valeur après le = sera assignée à ce qui a à gauche (pour les variables)
		
		int altitude = 1000; 
		
		long distance = 375;
		// ce sont les 4 types de variable numériques. 
		
		// Les types chiffres à virgule sont float et double
		
		double longueur = 15.8d; // on ajoute le d afin de souligner que c'est un double et non un float
		
		float hauteur = 16.5f; // ici le f permet de souligner que c'est un float
		
		// les types caractère et chaine de caractères
		
		char a = 'a'; // Single quotes pour les char
		
		String nom = "Dusseux"; // String commence TOUJOURS par un S majuscule
		
		// le modulo lui, est le reste d'une division
		// par exemple: 6%2 = 0 car 6/2 = 3 donc 0 reste. il y aura un reste si le résultat est un chiffre à virgule
		// 7%2 = 1. 1 en résultat car 7 = 2+2+2+ 1 
		
		// il existe un raccourci 
		int cpt = 25;
		cpt++; // cpt=cpt +1
		cpt+=45; // cpt = cpt + 45 // le += est un ajout personalisable du chiffre suivant
		// ++ = +1
		// +=45 = +45
		
		int age = 28;
		byte VraiAge = (byte)age;
		// ici nous avons surcasté int 
		// byte prend la valeur de int et la valeur de int devient de type byte (à cause de l'action de surcaster)
		
		
		byte AncienAge = 77;
		long NouvelAge = (long)AncienAge;
		
		
		
	// Pour transférer mes exercices ou mon code sur GitHub
	// On peut user du terminal 
	// Via le terminal, on doit se situer dans le dossier où se trouve le projet
	// Ce projet par exemple est situé dans eclipse-workspace
		
	// Ensuite tu tapes git init
	// Ça crée localement le projet git auprès du fichier que l'on souhaite transférer
	// On check si tout est OK en faisant un git status
	
	// On fait ensuite un nano .gitignore
	// là dedans tu écris ce que tu ne veux pas transférer sur GitHub	
	// dans ce fichier à l'aide de nano, par exemple le logiciel Eclipse ajoute des trucs inutiles comme
	// .classpath .project .settings/ (ici nous avons 2 fichiers et 1 dossier car " / à la fin")
	
	// le cat .gitignore sur le terminal permet ici d'afficher ce qu'il y a dedans
	// pour ajouter tous les fichiers nous avons 3 façons de procéder (add)
	// nous avons add -A, add *, et add -am (pas sûr pour celui là)
	
	
	
	
	
	
		
		
		
		
		
		
	}

}
