<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/site.css" type="text/css"
	media="screen" title="no title">
<script src="../js/jquery-1.10.2.min.js"></script>
<script src="../js/site.js"></script>
</head>
<body>
	<nav class="main-nav">
		<ul class="nav-list">
			<li><a href="#">Home</a></li>
			<li><a href="#">Studenti</a>
				<ul class="dropdown">
					<li><a href="saveStudent.do">Inserisci</a></li>
					<li><a href="#">Iscrivi</a></li>
					<li><a href="#">Ricerca per Corso</a></li>
				</ul></li>
			<li><a href="#">Corsi</a>
				<ul class="dropdown">
					<li><a href="#">Inserisci</a></li>
					<li><a href="#">Lista Corsi</a></li>
					<li><a href="#">Ricerca</a></li>
				</ul></li>
			<li><a href="#">Info</a></li>
			<li><a href="#">Contatti</a></li>
		</ul>
	</nav>
	<form action="saveStudent.do" method="post" class="elegant-aero">
		<h1>
			Registrazione Studente <span>Inserite i dati sottostanti</span>
		</h1>
		<label> <span>Nome :</span> <input id="name" type="text"
			name="name" placeholder="Il tuo nome" /> <label> <span>Cognome
					:</span> <input id="lastname" type="text" name="lastname"
				placeholder="Il tuo cognome" /></label> <label> <span>Sesso
					:</span> <input id="sex" type="radio" name="sex" value='m' />maschile <input
				id="sex" type="radio" name="sex" value='f' />femminile <input
				id="sex" type="radio" name="sex" value='o' />sì, grazie
		</label> <label> <span>Data di nascita :</span> <input id="birthdate"
				name="birthdate" type="date" />
		</label>
		</label> <label> <span>&nbsp;</span> <input type="button"
			class="button" value="Salva dati" />
		</label>
	</form>

</body>
</html>