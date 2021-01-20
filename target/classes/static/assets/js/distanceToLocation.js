var earthRadius = 6371;

function calculateDistance(lat, long) {

    var latTurin = 45.05
    var lonturin = 7.6667
    var dlat = latTurin-lat; // Difference of latitude
    var dlon = lonturin-long; // Difference of longitude

    var disLat = (dlat*Math.PI*earthRadius)/180; // Vertical distance
    var disLon = (dlon*Math.PI*earthRadius)/180; // Horizontal distance

    var ret = Math.pow(disLat, 2) + Math.pow(disLon, 2); 
    ret = Math.sqrt(ret); // Total distance (calculated by Pythagore: a^2 + b^2 = c^2)
    return ret; 
    // Now you have the total distance in the variable ret
} 

