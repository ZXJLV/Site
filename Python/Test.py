import os

# Define the number of files to be generated
num_files = 5

# Define the filename template
filename_template = "真心菜是大傻呗_{}.txt"

# Define the content to be written to each file
file_content = "真心菜是大傻呗真心菜是大傻呗真心菜是大傻呗真心菜是大傻呗真心菜是大傻呗真心菜是大傻呗真心菜是大傻呗真心菜是大傻呗真心菜是大傻呗 {}"

# Define the directory where the files will be generated
directory = "D:"

# Create the directory if it does not exist
if not os.path.exists(directory):
    os.makedirs(directory)

# Loop through the number of files
for i in range(num_files):
    # Generate a filename
    filename = filename_template.format(i+1)
    # Define the full file path
    file_path = os.path.join(directory, filename)
    # Open the file for writing
    with open(file_path, "w") as file:
        # Write the content to the file
        file.write(file_content.format(i+1))

print("Done generating files.")

