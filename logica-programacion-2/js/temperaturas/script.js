const btn = document.getElementById('convert');
const clearBtn = document.getElementById('clear');
const fText = document.getElementById('fText');
const kText = document.getElementById('kText');
const alertPlaceholder = document.getElementById('alertPlaceholder');
let alertTimeout = null;

function showError(message) {
  // limpiar alertas previas y timeout
  if (alertTimeout) {
    clearTimeout(alertTimeout);
    alertTimeout = null;
  }
  alertPlaceholder.innerHTML = `<div class="alert alert-danger py-2 mb-3" role="alert">${message}</div>`;
  // ocultar automáticamente después de 2.5s
  alertTimeout = setTimeout(() => {
    alertPlaceholder.innerHTML = '';
    alertTimeout = null;
  }, 2500);
}

function convertir() {
  // Limpiar resultados previos
  fText.textContent = '';
  kText.textContent = '';

  const input = document.getElementById('celsius').value.trim();
  const celsius = Number(input);

  if (input === '' || Number.isNaN(celsius)) {
    showError('Error: ingresa un número válido.');
    return;
  }

  const fahrenheit = (celsius * 9 / 5) + 32;
  const kelvin = celsius + 273.15;

  fText.textContent = `Grados Fahrenheit: ${fahrenheit.toFixed(2)} °F`;
  kText.textContent = `Grados Kelvin: ${kelvin.toFixed(2)} K`;
}

btn.addEventListener('click', convertir);

clearBtn.addEventListener('click', () => {
  document.getElementById('celsius').value = '';
  fText.textContent = '';
  kText.textContent = '';
  if (alertTimeout) {
    clearTimeout(alertTimeout);
    alertTimeout = null;
  }
  alertPlaceholder.innerHTML = '';
});

// Permitir Enter en el input
document.getElementById('celsius').addEventListener('keydown', (e) => {
  if (e.key === 'Enter') convertir();
});
